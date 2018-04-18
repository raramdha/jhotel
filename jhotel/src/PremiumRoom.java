
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private double DISCOUNT = 0.3;
    private TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, 
    StatusKamar status_kamar)
    {
        super(hotel,nomor_kamar,status_kamar);
        
    }


    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    public double getDiscount(){
        return DISCOUNT;
    }
    public void setDailyTariff(double dailytariff){
        dailytariff = dailytariff * DISCOUNT;
    }
}
