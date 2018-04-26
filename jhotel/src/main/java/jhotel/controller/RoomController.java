package jhotel;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class RoomController {
    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        ArrayList<Room> listroom = DatabaseRoom.getVacantRooms();
        return listroom;
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String room_no){
        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), room_no);
        return kamar;
    }
}
