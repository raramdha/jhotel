package jhotel;

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
     * @param  pesan dan kamar (pesanan dan detail kamar yang akan
     * dipesan)
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        kamar.setStatusKamar(StatusKamar.Booked);
    }
    /**
     * Method untuk memproses kamar Hotel yang batal dipesan
     *
     * @param  kamar yang akan dipesan
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
            pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
    }
    /**
     * Method untuk memproses kamar Hotel yang telah berhasil
     * dipesan
     *
     * @param  kamar yang akan dipesan
     */
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
            pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
    }
    /**
     * Method untuk memproses pesanan yang dibatalkan
     *
     * @param  pesan (pesanan yang dilakukan)
     */
    public static void pesananDibatalkan(Pesanan pesan){
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
        pesan.setStatusAktif(false);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    /**
     * Method untuk memproses pesanan yang telah berhasil 
     * dilakukan
     *
     * @param  pesan (pesanan yang dilakukan)
     */
    public static void pesananSelesai(Pesanan pesan){
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.Vacant);
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    }
}
