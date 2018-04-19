public class PesananTidakDitemukanException extends Exception {
    private Customer pelanggan_error;

    public PesananTidakDitemukanException(Customer pelanggan_input){
        super("Pesanan yang dipesan oleh:");
        pelanggan_input = pelanggan_error;
    }

    public String getPesan(){
        return (super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.");
    }
}
