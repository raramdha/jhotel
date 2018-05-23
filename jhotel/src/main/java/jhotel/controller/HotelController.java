package jhotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Class HotelController menggambarkan fungsi-fungsi untuk memodifikasi Database Hotel
 * dengan menggunakan web service
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
@RestController
public class HotelController {

    /**
     * Method untuk mengambil list hotel yang tersedia
     * @return  listhotel
     */
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelsList(){
        ArrayList<Hotel> listhotel = DatabaseHotel.getHotelDatabase();
        return listhotel;

    }

    /**
     * Method untuk mengambil detail hotel berdasarkan id-nya
     * @return  hotel
     */
    @RequestMapping(value = "/hotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel){
        Hotel hotel = DatabaseHotel.getHotel(id_hotel);
        return hotel;
    }


}
