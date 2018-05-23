package jhotel;
/**
 * Class RoomSudahAdaException merupakan user-defined exception untuk
 * error-handling saat data kamar sudah terdaftar pada Database Room
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class RoomSudahAdaException extends Exception {
    //instance variabel yang digunakan
    private Room room_error;

    /**
     * Constructor untuk object dari class RoomSudahAdaException
     */
    public RoomSudahAdaException(Room room_input){
        super("Kamar dengan nomor ruang ");
        room_error = room_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + room_error.getNomorKamar()
                + " pada " + room_error.getHotel() + "sudah terdaftar.");
    }
}
