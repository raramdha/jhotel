
/**
 * Class Hotel menggambarkan detail dari Customer yang akan memesan
 * kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Customer
{
    //variabel-variabel yang digunakan
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    /**
     * Constructor untuk object dari class Customer
     */
    public Customer(int id, String nama, int tanggal, int bulan,
    int tahun)
    {
        this.id = id;
        this.nama = nama;
        //GregorianCalendar calendar = new GregorianCalendar(
        //tahun,bulan,tanggal);
    }
    public Customer(int id, String nama, Date dob){
        this.id = id;
        this.nama = nama;
        this.dob = dob;
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
    public String getEmail(){
        return email;
    }
    public Date getDOB(){
        dob = new Date();
        System.out.println(dob);
        return dob;
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
    public void setEmail(String email){
        String REGEX = "[^.][^\\s]+\\b@\\b[^-][^\\s]+"; 
        Pattern p = Pattern.compile(REGEX); 
        Matcher m = p.matcher(email); 
        System.out.println("Email: " +email+" "+m.matches()); 
        
        this.email = email;
    }
    public void setDOB(Date dob){
        this.dob = dob;
    }
    public String toString(){
        return null;
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

