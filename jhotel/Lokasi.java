
/**
 * Class Lokasi menggambarkan detail dari lokasi suatu Hotel.
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Lokasi
{
    // variabel-variabel yang digunakan
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    /**
     * Constructor berisi object dari class Lokasi
     */
    public Lokasi(float x_coord, float y_coord, 
    String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * Method untuk mengambil koordinat X dari lokasi Hotel
     * dalam bentuk float
     * 
     * @return  koordinat X dari lokasi hotel
     */
    public float getX()
    {
        return x_coord;
    }
    /**
     * Method untuk mengambil koordinat Y dari lokasi Hotel
     * dalam bentuk float
     * 
     * @return  koordinat Y dari lokasi hotel
     */
    public float getY()
    {
        return y_coord;
    }
    /**
     * Method untuk mengambil deskripsi dari lokasi Hotel
     * dalam bentuk string
     * 
     * @return  deskripsi dari lokasi hotel
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    /**
     * Method untuk menentukan koordinat X dari lokasi Hotel
     * dalam bentuk float
     * 
     * @param  koordinat X dari lokasi hotel
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }
    /**
     * Method untuk menentukan koordinat Y dari lokasi Hotel
     * dalam bentuk float
     * 
     * @param  koordinat Y dari lokasi hotel
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }
    /**
     * Method untuk menentukan deskripsi dari lokasi Hotel
     * dalam bentuk string
     * 
     * @param  deskripsi dari lokasi hotel
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }
    public String toString(){
        return null;
    }
    /**
     * Method untuk menampilkan detail lokasi dari suatu 
     * Hotel
     */
    public void printData()
    {
        System.out.println("\nLokasi Hotel");
        System.out.println("Koordinat x\t: " + x_coord);
        System.out.println("Koordinat y\t: " + y_coord);
        System.out.println("Deskripsi\t: " + deskripsiLokasi);
    }
}
