package jhotel;
/**
 * Class JHotel berisi method main untuk memanggil tiap proses
 * yang dapat dilakukan pada Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (1- Maret 2018)
 */
import java.util.GregorianCalendar;
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
        SpringApplication.run(JHotel.class, args);

        try {
            DatabaseHotel.addHotel(new Hotel("AB", new Lokasi(200, 100, "asdf"), 4));
            DatabaseHotel.addHotel(new Hotel("BA", new Lokasi(500, 600, "asd"), 3));

            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "A201"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2), "A501"));

        }
        catch (HotelSudahAdaException p) {
            System.out.println("\n>>>TES HOTEL SUDAH ADA BERHASIL<<<");
            System.out.println(p.getPesan());
        }
        catch (RoomSudahAdaException p) {
            System.out.println("\n>>>TES KAMAR SUDAH ADA BERHASIL<<<");
            System.out.println(p.getPesan());
        }


    }


}

