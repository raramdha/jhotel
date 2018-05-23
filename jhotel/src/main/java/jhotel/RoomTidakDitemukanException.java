package jhotel;
/**
 * Class RoomTidakDitemukanException merupakan user-defined exception untuk
 * error-handling saat data kamar tidak ditemukan pada Database Room
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class RoomTidakDitemukanException extends Exception {
    //instance variabel yang digunakan
    private Hotel hotel_error;
    private String room_error;

    /**
     * Constructor untuk object dari class RoomTidakDitemukanException
     */
    public RoomTidakDitemukanException(Hotel hotel_input, String room_input){
        super("Kamar yang terletak di: ");
        hotel_error = hotel_input;
        room_error = room_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + hotel_error + " dan dengan nomor kamar "
                + room_error + " tidak ditemukan.");
    }
}
