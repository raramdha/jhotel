package jhotel;
/**
 * Class JHotel berisi method main untuk memanggil tiap proses
 * yang dapat dilakukan pada Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JHotel
{
    /**
     * Constructor untuk object dari class JHotel
     */
    public JHotel(){
    }

    /**
     * Method untuk memanggil proses apapun terhadap Hotel
     * 
     * argumen dengan tipe data String
     */
    public static void main(String args[]) {
        try {
            DatabaseHotel.addHotel(new Hotel("Hyatt", new Lokasi(200, 100, "Jakarta"), 5));
        }
        catch (HotelSudahAdaException ex){
            ex.getPesan();
        }
        try{
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
        }
        catch(RoomSudahAdaException ex){
            ex.getPesan();
        }
        try{
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "A201"));
        }
        catch(RoomSudahAdaException ex){
            ex.getPesan();
        }
        try{
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "A501"));
        }
        catch(RoomSudahAdaException ex){
            ex.getPesan();
        }

        SpringApplication.run(JHotel.class, args);


    }


}

