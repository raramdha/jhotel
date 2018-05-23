package jhotel;
/**
 * Class DatabaseHotel menggambarkan detail cara-cara
 * memodifikasi data Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */

import java.util.ArrayList;

public class DatabaseHotel {
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Constructor berisi object dari class DatabaseHotel
     */
    public DatabaseHotel() {
    }

    /**
     * Method getHotelDatabase untuk mengambil keseluruhan
     * data hotel yang akan disimpan dalam Database
     *
     * @return default dari tipe data String
     */
    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    /**
     * Method getLastHotelID untuk mengambil ID
     * hotel yang terakhir disimpan dalam Database
     *
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * Method addHotel untuk menambahkan data hotel baru ke dalam Database
     * @param baru (hotel yang akan ditambahkan)
     * @exception HotelSudahAdaException
     * @return default dari tipe data boolean
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID() == baru.getID() || (hotel.getLokasi().equals(baru.getLokasi()) && hotel.getNama().compareTo(baru.getNama())==0)){
                throw new HotelSudahAdaException(hotel);
            }
        }
        HOTEL_DATABASE.add(baru);
        LAST_HOTEL_ID = baru.getID();
        return true;
    }

    /**
     * Method getHotel untuk mengambil data hotel
     *
     * @param id hotel
     * @return default dari tipe Hotel
     */
    public static Hotel getHotel(int id) {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if (hotel.getID() == id) return hotel;
        }
        return null;
    }

    /**
     * Method removeHotel untuk menghapus data hotel yang ada dalam Database
     * @param id hotel yang akan dihapus
     * @exception HotelTidakDitemukanException
     * @return default dari tipe data boolean
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException {
        for (Hotel hotel :
                HOTEL_DATABASE) {
            if(hotel.getID()==id){
                for (Room kamar :
                        DatabaseRoom.getRoomsFromHotel(hotel)) {
                    try{
                        DatabaseRoom.removeRoom(hotel, kamar.getNomorKamar());
                    }
                    catch(RoomTidakDitemukanException e){

                    }
                }
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new HotelTidakDitemukanException(id);
    }
}


