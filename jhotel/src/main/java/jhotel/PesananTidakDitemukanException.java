package jhotel;
/**
 * Class PesananTidakDitemukanException merupakan user-defined exception untuk
 * error-handling saat hotel tidak ditemukan pada Database Customer
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class PesananTidakDitemukanException extends Exception {
    //instance variabel yang digunakan
    private Customer pelanggan_error;

    /**
     * Constructor untuk object dari class PesananSudahAdaException
     */
    public PesananTidakDitemukanException(Customer pelanggan_input){
        super("Pesanan yang dipesan oleh: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.");
    }
}
