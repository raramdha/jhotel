
/**
 * Class Hotel menggambarkan detail dari pesanan pada kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
import java.util.Date;

public class Pesanan
{
    // variabel-variabel yang digunakan
        private double biaya;
        private double jumlahHari;
        private Customer pelanggan;
        private boolean isDiproses;
        private boolean isSelesai;
        private Room kamar;
        private Date tanggalPesan;
    /**
     * Constructor berisi object pada class Pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan,
    Room kamar)
    {
        // initialise instance variables
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
    }
    public double getBiaya(){
        return biaya;
    }
    public double getJumlahHari(){
        return jumlahHari;
    }
    public Customer getPelanggan(){
        return pelanggan;
    }
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
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    public void setJumlahHari(double jumlahHari){
        this.jumlahHari = jumlahHari;
    }
    public void setPelanggan(Customer pelanggan){
        this.pelanggan = pelanggan;
    }
    public void setStatusDiproses(boolean diproses){
        this.isDiproses = isDiproses;
    }
    public void setStatusSelesai(boolean diproses){
        this.isSelesai = isSelesai;
    }
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    public String toString(){
        return null;
    }
    /**
     * Method untuk menampilkan detail pesanan kamar hotel
     */
    public void printData()
    {
       System.out.println("\nDetail Pesanan");
       System.out.println("Nama Pelanggan\t: " + pelanggan.getNama());
       System.out.println("Jumlah Hari\t: " + jumlahHari);
       System.out.println("Biaya\t\t: " + biaya);
       System.out.println("Status Pemesanan Diproses: " + isDiproses);
       System.out.println("Status Pemesanan Selesai: " + isSelesai);
    }
}
    
    
