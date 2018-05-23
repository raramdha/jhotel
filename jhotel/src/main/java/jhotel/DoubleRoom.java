package jhotel;
/**
 * Class DoubleRoom menggambarkan detail kamar Hotel bertipe Double
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class DoubleRoom extends Room
{
    // instance variable yang digunakan
    private Customer customer2;
    private TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * Constructor berisi object dari class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel,nomor_kamar);
        
    }

    /**
     * Method getCustomer2 untuk mengambil customer yang memesan kamar Double
     *
     * @return    customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

    /**
     * Method getTipeKamar untuk mengambil kamar bertipe Double
     *
     * @return tipe kamar
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }

    /**
     * Method setCustomer2 untuk menentukan customer yang memesan kamar Double
     *
     * @param customer2
     */
    public void setCustomer2(Customer customer2){
        this.customer2 = customer2;
    }
}
