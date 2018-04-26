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

    }


}

