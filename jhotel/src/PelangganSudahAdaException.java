


public class PelangganSudahAdaException extends Exception{
    private Customer pelanggan_error;

    public PelangganSudahAdaException(Customer pelanggan_input){
        super("Pelanggan dengan data: ");
        pelanggan_input = pelanggan_error;

    }

    public String getPesan(){
        return (super.getMessage() + pelanggan_error + " sudah terdaftar.");
    }
}
