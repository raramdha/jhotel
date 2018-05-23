package jhotel;
/**
 * Class HotelSudahAdaException merupakan user-defined exception untuk
 * error-handling saat hotel sudah terdaftar pada Database Hotel
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class HotelSudahAdaException extends Exception {
    //instance variabel yang digunakan
    private Hotel hotel_error;

    /**
     * Constructor untuk object dari class HotelSudahAdaException
     */
    public HotelSudahAdaException(Hotel hotel_input){
        super("Hotel dengan nama: ");
        hotel_error = hotel_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + hotel_error.getNama() + " sudah terdaftar.");

    }
}
