
/**
 * Class Room menggambarkan detail dari dari kamar Hotel yang 
 * dapat dipesan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Room
{
    // variabel-variabel yang digunakan
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    /**
     * Constructor berisi object dari class Room
     */
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, 
    Customer customer, double dailytariff, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.customer = customer;
        dailyTariff = dailytariff;
        this.status_kamar =status_kamar;
    }

    /**
     * Method untuk mengambil detail Hotel pemilik kamar
     *
     * @return  detail hotel yang bersangkutan
     */
    public Hotel getHotel()
    {
        // put your code here
        return hotel;
    }
    /**
     * Method untuk mengambil ID kamar yang bersangkutan
     *
     * @return  ID kamar yang bersangkutan
     */
    public int getID()
    {
        return id;
    }
    /**
     * Method untuk mengambil nomor kamar yang bersangkutan
     *
     * @return  nomor kamar yang bersangkutan
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    /**
     * Method untuk mengambil status ketersediaan kamar yang bersangkutan
     *
     * @return  status ketersediaan kamar yang bersangkutan
     */
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    /**
     * Method untuk mengambil detail customer yang memesan kamar 
     *
     * @return  detail customer pemesan kamar
     */
    public Customer getCustomer()
    {
        return customer;
    }
    /**
     * Method untuk mengambil harga sewa kamar yang bersangkutan
     * per harinya
     *
     * @return  harga sewa kamar per hari
     */
    public double getDailyTariff(){
        return dailyTariff;
    }
    /**
     * Method untuk mengambil status kamar yang bersangkutan
     *
     * @return  status kamar yang bersangkutan
     */
    public StatusKamar getStatusKamar(){
        return status_kamar;
    }
    /**
     * Method untuk mengambil detail pesanan kamar 
     *
     * @return  detail pesanan kamar
     */
    public Pesanan getPesanan(){
        return pesan;
    }
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff;
    }
    public void setStatusKamar(StatusKamar status_kamar){
        this.status_kamar=status_kamar;
    }
    public void setPesanan(Pesanan pesan){
        this.pesan=pesan;
    }
    /**
     * Method untuk menampilkan detail kamar Hotel
     */
    public void printData(){
        System.out.println("\nKamar Hotel");
        System.out.println("Nama Hotel\t: " + hotel.getNama());
        System.out.println("Nomor Kamar\t: " + nomor_kamar);
        System.out.println("Status\t\t: " + isAvailable);
        System.out.println("Pelanggan\t: " + customer.getNama());
        System.out.println("Harga\t\t: " + dailyTariff);
        System.out.println("Status Kamar\t: " + status_kamar);
        
    }
}