/**
 * Class LetsGo menjalankan perlombaan lari yang ingin dilakukan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (21 April 2018)
 *
 */
import java.util.Random;

public class LetsGo {
    //instance variables
    private static int min = 100;
    private static int maks = 500;

    //Method random yang akan menghasilkan nilai random
    private static int random(){
        return new Random().nextInt(maks-min)+min;
    }

    //Method main untuk menampilkan hasil dari perlombaan lari
    public static void main(String[] args) {
        int l, a, m;
        do
        {
            l = random();
            a = random();
            m = random();
        }
        while (!(l > a && a > m));

        RunForYourLife Lionel = new RunForYourLife("Lionel", l);
        Lionel.start();
        RunForYourLife Andres = new RunForYourLife("Andres", a);
        Andres.start();
        RunForYourLife Messi = new RunForYourLife("Messi", m);
        Messi.start();
    }
}
