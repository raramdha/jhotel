package jhotel;
import java.util.ArrayList;
/**
 * Class DatabaseRoom menggambarkan detail dari
 * cara-cara memodifikasi data kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class DatabaseRoom
{
    //variabel-variabel yang digunakan
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * Constructor berisi object dari class DatabaseRoom
     */
    public DatabaseRoom()
    {
    }

    /**
     * Method getRoomDatabase untuk mengambil keseluruhan
     * data Room yang akan disimpan dalam Database
     *
     * @return  data pada database room
     */
    public static ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }

    /**
     * Method addRoom untuk menambahkan data Room baru ke dalam Database
     * @param  baru (kamar yang akan ditambahkan)
     * @exception RoomSudahAdaException
     * @return  default dari tipe data boolean
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        if(baru.getHotel() != null) {
            for (Room kamar :
                    ROOM_DATABASE) {
                if(kamar.getHotel().equals(baru.getHotel())){
                    if(baru.getNomorKamar().compareTo(kamar.getNomorKamar()) == 0){
                        throw new RoomSudahAdaException(baru);
                    }
                }
            }
            ROOM_DATABASE.add(baru);
            return true;
        }
        else return false;
    }

    /**
     * Method getRoom untuk mengambil data Room untuk dimasukkan ke dalam Database
     * @param  hotel dan nomor kamar
     * @return  default dari tipe data boolean
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for (Room kamar :
                ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) && kamar.getNomorKamar().compareTo(nomor_kamar) == 0) {
                return kamar;
            }
        }
        return null;
    }

    /**
     * Method getRoomsFromHotel untuk mengambil data Room dari Database Hotel
     * @param  hotel
     * @return  toReturn
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    /**
     * Method getVacantRooms untuk mengambil data Room yang berstatus Vacant
     * @return  toReturn
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> toReturn = new ArrayList<>();
        for (Room kamar : ROOM_DATABASE) {
            if(kamar.getStatusKamar().equals(StatusKamar.Vacant)){
                toReturn.add(kamar);
            }
        }
        return toReturn;
    }

    /**
     * Method removeRoom untuk menghapus data Room yang ada dalam Database
     * @param   hotel dan nomor kamar yang akan dihapus
     * @exception RoomTidakDitemukanException
     * @return  default dari tipe data boolean
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException{
        for (Room kamar :
                ROOM_DATABASE) {
            if(kamar.getHotel().equals(hotel)){
                if(kamar.getNomorKamar().compareTo(nomor_kamar) == 0){
                    Administrasi.pesananDibatalkan(kamar);
                    ROOM_DATABASE.remove(kamar);
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel,nomor_kamar);
    }
}