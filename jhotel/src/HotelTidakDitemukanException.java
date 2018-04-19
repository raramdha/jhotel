public class HotelTidakDitemukanException extends Exception {
    private int hotel_error;

    public HotelTidakDitemukanException(int hotel_input){
        super("Hotel dengan ID: ");
        hotel_input = hotel_error;
    }

    public String getPesan(){
        return (super.getMessage() + hotel_error + " tidak ditemukan.");

    }
}
