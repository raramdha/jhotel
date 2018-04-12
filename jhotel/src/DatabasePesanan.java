import java.util.*;
/**
 * Class DatabasePesanan menggambarkan detail dari
 * cara-cara memodifikasi data Pesanan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class DatabasePesanan
{
    //variabel-variabel yang digunakan
    private static ArrayList<Pesanan> PESANAN_DATABASE;
    private static int LAST_PESANAN_ID;
    /**
     * Constructor berisi object dari class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk menambahkan Pesanan baru ke dalam
     * database Pesanan
     * 
     * @return  default dari tipe data boolean
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(baru.getStatusAktif() == true){
            return false;
        }
        else {
            PESANAN_DATABASE.add(baru);
            return true;
        }
    }
    /**
     * Method untuk menghapus Pesanan dari
     * database Pesanan
     * 
     * @return  default dari tipe data boolean
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    /**
     * Method untuk mengambil data Pesanan dari database
     * 
     * @return  default dari tipe data Pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan){
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getPelanggan() == pelanggan) {
                return pesan;
            }
        }
        return null;

    }
    public static Pesanan getPesanan(int id)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getID() == id) {
                return pesan;
            }
        }
        return null;
    }
    public static Pesanan getPesanan(Room kamar)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getRoom() == kamar) {
                return pesan;
            }
        }
        return null;
    }
    /**
     * Method untuk mengambil isi database Pesanan
     * 
     * @return  default dari tipe data String
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }




}
