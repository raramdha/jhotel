package jhotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelsList(){
        ArrayList<Hotel> listhotel = DatabaseHotel.getHotelDatabase();
        return listhotel;

    }

    @RequestMapping(value = "/hotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }


}
