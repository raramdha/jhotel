
/**
 * Class Administrasi menggambarkan detail proses administrasi
 * dari pesanan Hotel yang bersangkutan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Administrasi
{
    /**
     * Constructor berisi object dari class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
       
    }

    /**
     * Method untuk memulai proses memesan kamar pada Hotel
     *
     * @param  detail pesanan dan detail kamar yang akan 
     * dipesan
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan, kamar);
    }
    /**
     * Method untuk memproses pesanan kamar pada Hotel
     *
     * @param  detail pesanan dan detail kamar yang akan 
     * dipesan
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    /**
     * Method untuk memproses kamar Hotel yang tidak jadi
     * dipesan
     *
     * @param  detail kamar yang akan dipesan
     */
    public static void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    /**
     * Method untuk memproses kamar Hotel yang batal dipesan
     *
     * @param   detail kamar yang akan dipesan
     */
    public static void pesananDibatalkan(Room kamar){
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    /**
     * Method untuk memproses kamar Hotel yang telah berhasil
     * dipesan
     *
     * @param  detail kamar yang akan dipesan
     */
    public static void pesananSelesai(Room kamar){
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.setPesanan(null);
        roomLepasPesanan(kamar);
    }
    /**
     * Method untuk memproses pesanan yang dibatalkan
     *
     * @param  detail pesanan yang dilakukan
     */
    public static void pesananDibatalkan(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    }
    /**
     * Method untuk memproses pesanan yang telah berhasil 
     * dilakukan
     *
     * @param  detail pesanan yang dilakukan
     */
    public static void pesananSelesai(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    }
}
