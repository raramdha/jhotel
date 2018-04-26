package jhotel;
/**
 * Class Hotel menggambarkan detail dari Hotel yang terdiri
 * dari nama hotel, lokasi, dan bintang.
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Hotel
{
    // variabel-variabel yang digunakan
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;

    /**
     * Constructor untuk object dari class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID()+1;
    }

    /**
     * Method untuk mengambil id Hotel dalam bentuk integer
     *
     * @return  id hotel
     */
    public int getID(){
        return id;
    }
    /**
     * Method untuk mengambil bintang Hotel dalam bentuk integer
     * 
     * @return  bintang hotel
     */
    public int getBintang()
    {
        return bintang;
    }
    /**
     * Method untuk mengambil nama hotel dalam bentuk string
     *
     * @return  nama hotel
     */
    public String getNama()
    {
        return nama;
    }
    /**
     * Method untuk mengambil lokasi dari Hotel
     *
     * @return  lokasi hotel
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    /**
     * Method untuk menentukan id dari Hotel
     *
     * @param id hotel
     */
    public void setID(int id){
        this.id = id;
    }
    /**
     * Method untuk menentukan bintang dari Hotel
     *
     * @param bintang hotel
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    /**
     * Method untuk menentukan nama dari Hotel
     *
     * @param nama hotel
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    /**
     * Method untuk menentukan lokasi dari Hotel
     *
     * @param lokasi hotel
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Method untuk menampilkan detail Hotel
     */
    public String toString()
    {
        return("\nHotel: " + nama+", Lokasi: " + lokasi.getDeskripsi()+
        ", Bintang: " + bintang + " ");
        
    }
}
    
