package jhotel;
/**
 * Class DoubleRoom menggambarkan detail kamar Hotel bertipe Single
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class SingleRoom extends Room
{
    // instance variable yang digunakan
    private TipeKamar TIPE_KAMAR = TipeKamar.Single;

    /**
     * Constructor berisi object dari class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel,nomor_kamar);
    }

    /**
     * Method getTipeKamar untuk mengambil kamar bertipe Double
     *
     * @return tipe kamar
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
}
