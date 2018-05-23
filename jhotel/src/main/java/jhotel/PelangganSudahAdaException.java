package jhotel;
/**
 * Class PelangganSudahAdaException merupakan user-defined exception untuk
 * error-handling saat datapelanggan sudah terdaftar pada Database Customer
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public class PelangganSudahAdaException extends Exception{
    //instance variabel yang digunakan
    private Customer pelanggan_error;

    /**
     * Constructor untuk object dari class PelangganSudahAdaException
     */
    public PelangganSudahAdaException(Customer pelanggan_input){
        super("Pelanggan dengan data: ");
        pelanggan_error = pelanggan_input;

    }
    /**
     * Method untuk mengambil pesan yang akan muncul saat exception digunakan
     *
     * @return  pesan yang akan ditampilkan
     */
    public String getPesan(){
        return (super.getMessage() + pelanggan_error + " sudah terdaftar.");
    }
}
