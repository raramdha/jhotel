package jhotel;
/**
 * Class PelangganTidakDitemukanException merupakan user-defined exception untuk
 * error-handling saat hotel tidak ditemukan pada Database Customer
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class PelangganTidakDitemukanException extends Exception {
    //instance variabel yang digunakan
    int pelanggan_error;

    /**
     * Constructor untuk object dari class PelangganSudahAdaException
     */
    public PelangganTidakDitemukanException(int pelanggan_input){
        super("Data Customer dengan ID: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + pelanggan_error + " tidak ditemukan.");
    }

}
