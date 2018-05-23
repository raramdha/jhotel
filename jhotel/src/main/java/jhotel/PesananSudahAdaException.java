package jhotel;
/**
 * Class PesananSudahAdaException merupakan user-defined exception untuk
 * error-handling saat data pesanan sudah terdaftar pada Database Pesanan
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class PesananSudahAdaException extends Exception{
    //instance variabel yang digunakan
    private Pesanan pesanan_error;

    /**
     * Constructor untuk object dari class PesananSudahAdaException
     */
    public PesananSudahAdaException(Pesanan pesanan_input){
        super("Pesanan yang dipesan oleh ");
        pesanan_error = pesanan_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan.";
    }
}
