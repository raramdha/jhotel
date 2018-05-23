package jhotel;
/**
 * Class DoubleRoom menggambarkan detail kamar Hotel bertipe Premium
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class PremiumRoom extends Room
{
    // instance variable yang digunakan
    private double DISCOUNT = 0.3;
    private TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    /**
     * Constructor berisi object dari class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel,nomor_kamar);
        
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
     * Method setDailyTariff untuk menentukan tarif sewa kamar
     *
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff){
        dailytariff = dailytariff * DISCOUNT;
    }
}
