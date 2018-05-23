package jhotel;
/**
 * Class HotelTidakDitemukanException merupakan user-defined exception untuk
 * error-handling saat hotel tidak ditemukan pada Database Hotel
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class HotelTidakDitemukanException extends Exception {
    //instance variabel yang digunakan
    private int hotel_error;

    /**
     * Constructor untuk object dari class HotelTidakDitemukanException
     */
    public HotelTidakDitemukanException(int hotel_input){
        super("Hotel dengan ID: ");
        hotel_error = hotel_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + hotel_error + " tidak ditemukan.");

    }
}
