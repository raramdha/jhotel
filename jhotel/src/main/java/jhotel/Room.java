package jhotel;
/**
 * Class Room menggambarkan detail dari dari kamar Hotel yang 
 * dapat dipesan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public abstract class Room
{
    // variabel-variabel yang digunakan
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    
    /**
     * Constructor berisi object dari class Room
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar = StatusKamar.Vacant;
    }

    /**
     * Method untuk mengambil detail Hotel pemilik kamar
     *
     * @return  detail hotel yang bersangkutan
     */
    public Hotel getHotel()
    {
        return hotel;
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
    
    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    public void setDailyTariff(double dailytariff){
        dailyTariff = dailytariff;
    }
    public void setStatusKamar(StatusKamar status_kamar){ this.status_kamar=status_kamar; }
    /**
     * Method untuk menampilkan detail kamar Hotel
     */
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null)
        {
            return "\nHotel: " + getHotel().getNama()
                    + ", TipeKamar: " + getTipeKamar()
                    + ", Harga: " + getDailyTariff()
                    + ", StatusKamar: " + getStatusKamar().toString() + "\n";
        }
        else
        {
            return "Hotel: " + getHotel().getNama()
                    + ", TipeKamar: " + getTipeKamar()
                    + ", Harga: " + getDailyTariff()
                    + ", Status Kamar: " + getStatusKamar().toString()
                    + ", Pelanggan: " + DatabasePesanan.getPesanan(this).getPelanggan().getNama() + "\n";
        }
    }
}