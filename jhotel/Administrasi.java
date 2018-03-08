
/**
 * Write a description of class Administrasi here.
 *
 * @author (Ramdhaidfitri M)
 * @version (8 Maret 2018)
 */
public class Administrasi
{
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        
        
    }
    public void roomAmbilPesanan(Pesanan pesan, Room kamar){
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
        roomAmbilPesanan(pesan, kamar);
    }
    public void roomLepasPesanan(Room kamar){
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    public void pesananDibatalkan(Room kamar){
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananSelesai(Room kamar){
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananDibatalkan(Pesanan pesan){
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
    public void pesananSelesai(Pesanan pesan){
        Room kamar = pesan.getRoom();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        roomLepasPesanan(kamar);
    }
}
