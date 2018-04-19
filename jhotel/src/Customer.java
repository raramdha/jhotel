/**
 * Class Hotel menggambarkan detail dari Customer yang akan memesan
 * kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
import java.util.Date;
import java.text.*;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Customer
{
    //variabel-variabel yang digunakan
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    /**
     * Constructor untuk object dari class Customer
     */
    public Customer(String nama, int tahun, int bulan, int tanggal, String email)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob=new GregorianCalendar(tahun,bulan-1,tanggal).getTime();
        this.email = email;
    }

    public Customer(String nama, Date dob, String email){
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        this.email = email;
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
     * Method untuk mengambil email customer
     *
     * @return  nama customer
     */
    public String getEmail(){
        return email;
    }

    /**
     * Method untuk mengambil tanggal lahir customer
     *
     * @return  dob customer
     */
    public Date getDOB(){
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
    
    /**
     * Method untuk menentukan email customer dalam bentuk 
     * String
     * 
     * @param  email customer
     */
    public void setEmail(String email){
        String REGEX = "[^.][^\\s]+\\b@\\b[^-][^\\s]+"; 
        Pattern p = Pattern.compile(REGEX); 
        Matcher m = p.matcher(email); 
        System.out.println("Email: " +email+" "+m.matches()); 
        
        this.email = email;
    }

    /**
     * Method untuk menentukan tanggal lahir customer
     *
     * @param  dob customer
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }

    /**
     * Method untuk menampilkan detail Customer pemesan kamar hotel
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "\nCustomer ID \t:" + getID()
                    + "\nName \t\t:" + getNama()
                    + "\nE-Mail \t\t:" + getEmail()
                    + "\nDate of Birth \t:" + dateFormat.format(getDOB());
        }
        else
        {
            return "\nCustomer ID \t:" + getID()
                    + "\nName \t\t:" + getNama()
                    + "\nE-Mail \t\t:" + getEmail()
                    + "\nDate of Birth \t:" + dateFormat.format(getDOB())
                    + "\nBooking Order is in progress";
        }
    
    }
}

