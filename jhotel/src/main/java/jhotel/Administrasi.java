package jhotel;

/**
 * Class Administrasi menggambarkan detail proses administrasi
 * dari pesanan Hotel yang bersangkutan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class Administrasi
{
    /**
     * Constructor berisi object dari class Administrasi
     */
    public Administrasi()
    {
       
    }

    /**
     * Method untuk memulai proses memesan kamar pada Hotel
     *
     * @param  pesan dan kamar (pesanan dan detail kamar yang akan
     * dipesan)
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {

        if(kamar.getStatusKamar().equals(StatusKamar.Vacant)){
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            kamar.setStatusKamar(StatusKamar.Booked);
        }
        else{
            pesan.setStatusAktif(false);
        }
    }

    /**
     * Method untuk memproses kamar Hotel yang batal dipesan
     *
     * @param  kamar yang akan dipesan
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
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
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);

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
