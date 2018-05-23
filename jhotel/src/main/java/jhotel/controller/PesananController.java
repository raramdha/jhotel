package jhotel;
import org.springframework.web.bind.annotation.*;

/**
 * Class PesananController menggambarkan fungsi-fungsi untuk memodifikasi Database Pesanan
 * dengan menggunakan web service
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
@RestController
public class PesananController {

    /**
     * Method untuk mengambil detail pesanan seorang pelanggan
     * @return  pesan
     */
    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(int id_customer){
        Pesanan pesan = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pesan;
    }

    /**
     * Method untuk mengambil detail pesanan dari Database Pesanan
     * @return  pesanan
     */
    @RequestMapping(value = "/pesanan/{id_pesanan}", method = RequestMethod.GET)
    public Pesanan getPesanan(@PathVariable int id_pesanan){
        Pesanan pesanan = DatabasePesanan.getPesanan(id_pesanan);
        return pesanan;
    }

    /**
     * Method untuk melakukan pemesanan
     * @param id_customer, id_hotel, jumlah_hari, nomor_kamar
     */
    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value="jumlah hari") int jumlah_hari,
                            @RequestParam(value="id customer") int id_customer,
                            @RequestParam(value="id hotel") int id_hotel,
                            @RequestParam(value="nomor kamar") String nomor_kamar) throws PesananSudahAdaException {
        Pesanan pesanan = new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer));
            DatabasePesanan.addPesanan(pesanan);
            Administrasi.pesananDitugaskan(
                    DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar));
            Pesanan aktif = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
            return aktif;

    }

    /**
     * Method untuk membatalkan pemesanan
     * @param id_pesanan
     */
    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam(value="id_pesanan") int id_pesanan){
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    /**
     * Method untuk menyelesaikan pemesanan
     * @param id_pesanan
     */
    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaikanPesanan(@RequestParam(value="id_pesanan") int id_pesanan){
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

}



