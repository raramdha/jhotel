
/**
 * Class JHotel berisi method main untuk memanggil tiap proses
 * yang dapat dilakukan pada Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (1- Maret 2018)
 */
import java.util.GregorianCalendar;

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
            DatabaseCustomer.addCustomer(new Customer("Ramdha", 1998, 01, 23, "ra@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("A", 1998, 06, 20, "a@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("A", 1998, 06, 27, "a@gmail.com"));
        } catch (PelangganSudahAdaException p) {
            System.out.println("Pelanggan yang sudah ada: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabaseHotel.addHotel(new Hotel("AB", new Lokasi(200, 100, "asdf"), 4));
            DatabaseHotel.addHotel(new Hotel("BA", new Lokasi(500, 600, "asd"), 3));
            DatabaseHotel.addHotel(new Hotel("AC", new Lokasi(400, 200, "as"), 4));
            DatabaseHotel.addHotel(new Hotel("AC", new Lokasi(400, 200, "as"), 4));
        } catch (HotelSudahAdaException p) {
            System.out.println("Hotel yang sudah ada: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(2), "A101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1), "A201"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "A501"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "A501"));
        } catch (RoomSudahAdaException p) {
            System.out.println("Kamar yang sudah ada: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(15, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(22, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(22, DatabaseCustomer.getCustomer(3)));
        } catch (PesananSudahAdaException p) {
            System.out.println("Pesanan yang sudah ada: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabaseCustomer.removeCustomer(23);
        } catch (PelangganTidakDitemukanException p) {
            System.out.println("TES PELANGGAN TIDAK DITEMUKAN: \n");
            System.out.println(p.getPesan());
        }
        Customer cust1 = new Customer("Fitri", 1996, 4, 28, "fitri@ymail.com");
        Pesanan pesan = new Pesanan(11, cust1);

        try {
            DatabasePesanan.removePesanan(pesan);
        } catch (PesananTidakDitemukanException p) {
            System.out.println("TES PESANAN TIDAK DITEMUKAN: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabaseHotel.removeHotel(34);
        } catch (HotelTidakDitemukanException p) {
            System.out.println("TES HOTEL TIDAK DITEMUKAN: \n");
            System.out.println(p.getPesan());
        }

        try {
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2), "AAAA");
        } catch (RoomTidakDitemukanException p) {
            System.out.println("TES ROOM TIDAK DITEMUKAN: \n");
            System.out.println(p.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());

    }

        /*Administrasi admin = new Administrasi();
        admin.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A201"));
        admin.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "A101"));
        admin.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(3), "A501"));
        for(Pesanan pesan2 : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesan2);
        }

        admin.pesananSelesai(DatabasePesanan.getPesanan(1));
        admin.pesananSelesai(DatabasePesanan.getPesanan(2));
        admin.pesananDibatalkan(DatabasePesanan.getPesanan(3));
        for(Pesanan pesan3 : DatabasePesanan.getPesananDatabase()){
            System.out.println(pesan3);
        }
        */



}

