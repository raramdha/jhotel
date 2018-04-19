
public class PelangganTidakDitemukanException extends Exception {
    int pelanggan_error;

    public PelangganTidakDitemukanException(int pelanggan_input){
        super("Data Customer dengan ID: ");
        pelanggan_input = pelanggan_error;
    }

    public String getPesan(){
        return (super.getMessage() + pelanggan_error + " tidak ditemukan.");
    }

}
