
/**
 * Class Hotel menggambarkan detail dari pesanan pada kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class Pesanan
{
    // variabel-variabel yang digunakan
        private int id;
        private double biaya;
        private double jumlahHari;
        private Customer pelanggan;
        private boolean isAktif;
        private boolean isDiproses;
        private boolean isSelesai;
        private Room kamar;
        private Date tanggalPesan;
    /**
     * Constructor berisi object pada class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        // initialise instance variables
        isAktif = true;
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        tanggalPesan = new Date();
    }
    public int getID(){ return id; }
    public double getBiaya(){
        return biaya;
    }
    public double getJumlahHari(){
        return jumlahHari;
    }
    public Customer getPelanggan(){
        return pelanggan;
    }
    public boolean getStatusAktif() { return isAktif; }
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    public Room getRoom(){
        return kamar;
    }
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    public void setBiaya(){
        biaya = getBiaya() * getRoom().getDailyTariff();
    }
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
    }
    public void setStatusAktif(boolean aktif){
        this.isAktif = aktif;
    }
    public void setStatusDiproses(boolean diproses){
        this.isDiproses = diproses;
    }
    public void setStatusSelesai(boolean selesai){
        this.isSelesai = selesai;
    }
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    /**
     * Method untuk menampilkan detail pesanan kamar hotel
     */
    public String toString()
    {
       String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";
        
        return "Dibuat oleh " + getPelanggan().getNama()
            + ". Proses booking untuk " + getRoom().getHotel().getNama()
            + "kamar nomor " + getRoom().getNomorKamar()
            + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
            + ". Status: " + final_status + ".";
    }
}
    
    
