
/**
 * Class Hotel menggambarkan detail dari Customer yang akan memesan
 * kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Customer
{
    //variabel-variabel yang digunakan
    protected int id;
    protected String nama;
    /**
     * Constructor untuk object dari class Customer
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

    /**
     * Method untuk mengambil id Customer dalam bentuk 
     * integer
     * 
     * @return  id customer
     */
    public int getID()
    {
        return id;
    }
    /**
     * Method untuk mengambil nama customer dalam bentuk 
     * integer
     * 
     * @return  nama customer
     */
    public String getNama(){
        return nama;
    }
    /**
     * Method untuk menentukan ID customer dalam bentuk 
     * integer
     * 
     * @param  id customer
     */
    public void setID(int id){
        this.id = id;
    }
    /**
     * Method untuk menentukan nama customer dalam bentuk 
     * String
     * 
     * @param  nama customer
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    /**
     * Method untuk menampilkan detail Customer pemesan kamar hotel
     */
    public void printData()
    {
        System.out.println("\nData Customer");
        System.out.println("ID\t\t: " + id);
        System.out.println("Nama\t\t: " + nama);
    }
    
}

