
/**
 * Write a description of class Room here.
 *
 * @author (Ramdhaidfitri M)
 * @version (8 Maret 2018)
 */
public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Hotel getHotel()
    {
        // put your code here
        return hotel;
    }
    public int getID()
    {
        return id;
    }
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public double getDailyTariff(){
        return dailyTariff;
    }
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    public Pesanan getPesanan(){
        return pesan;
    }
    public void setHotel(Hotel hotel)
    {

    }
    public void setID(int id)
    {

    }
    public void setNomorKamar(String nomor_kamar)
    {
    }
    public void setStatusAvailable(boolean isAvailable)
    {

    }
    public void setCustomer(Customer customer)
    {
        
    }
    public void setDailyTariff(double dailytariff){

    }
    public void setStatusKamar(StatusKamar status_kamar){
 
    }
    public void setPesanan(Pesanan pesan){

    }
    public void printData(){
        
    }
}