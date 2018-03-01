
/**
 * Write a description of class Customer here.
 *
 * @author (Ramdha)
 * @version (a version number or a date)
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
     * Method untuk menentukan nama customer dalam bentuk 
     * integer
     * 
     * @param  id customer
     */
    public void setID(int id){
        this.id = id;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void printData()
    {
        System.out.println(nama);
    }
    
}

