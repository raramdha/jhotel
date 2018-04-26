package jhotel;
/**
 * Class DatabaseCustomer menggambarkan detail dari
 * cara-cara memodifikasi data Customer
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */

import java.util.ArrayList;

public class DatabaseCustomer
{
    //variabel-variabel yang digunakan
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID = 0;
    /**
     * Constructor berisi object dari class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables
    }

    /**
     * Method untuk mengambil database customer
     *
     * @return  CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    /**
     * Method untuk mengambil id customer yang terakhir diinput
     *
     * @return  LAST_CUSTOMER_ID
     */
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * Method untuk menambahkan Customer baru ke dalam
     * database
     * @param baru (customer baru)
     * @return  default dari tipe data boolean
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID() == baru.getID() || cust.getEmail().compareTo(baru.getEmail()) == 0){
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }


    /**
     * Method untuk mengambil Customer dari database
     * menggunakan id customer
     * @param id customer
     * @return  default dari tipe data boolean
     */
    public static Customer getCustomer(int id){
        for (Customer cust : CUSTOMER_DATABASE) {
            if (cust.getID() == id) return cust;
        }
        return null;
    }

    public  static Customer getCustomerLogin(String email, String password)
    {
        for (Customer cust : CUSTOMER_DATABASE) {
            if (cust.getEmail().compareTo(email) == 0 && cust.getPassword().compareTo(password) == 0){
                return cust;
            }

        }
        return null;
    }

    /**
     * Method untuk menghapus Customer dari database 
     * menggunakan id customer
     * @param id customer
     * @return  default dari tipe data boolean
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException {
        for (Customer cust :
                CUSTOMER_DATABASE) {
            if(cust.getID()==id){
                for (Pesanan pesan :
                        DatabasePesanan.getPesananDatabase()) {
                    if(pesan.getPelanggan().equals(cust)) {
                        try{
                            DatabasePesanan.removePesanan(pesan);
                        }
                        catch(PesananTidakDitemukanException e){

                        }
                    }
                }
                CUSTOMER_DATABASE.remove(cust);
                return true;
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

}
