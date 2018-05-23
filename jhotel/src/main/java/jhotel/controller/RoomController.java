package jhotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Class RoomController menggambarkan fungsi-fungsi untuk memodifikasi Database Room
 * dengan menggunakan web service
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
@RestController

public class RoomController {

    /**
     * Method untuk mengambil detail kamar yang berstatus Vacant
     * @return  listroom
     */
    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> listroom = DatabaseRoom.getVacantRooms();
        return listroom;
    }

    /**
     * Method untuk mengambil detail kamar berdasarkan id hotel dan nomor kamar
     * @return  kamar
     */
    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String room_no){
        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), room_no);
        return kamar;
    }
}
