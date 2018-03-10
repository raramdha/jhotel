
/**
 * Class Hotel menggambarkan detail dari pesanan pada kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class Pesanan
{
    // variabel-variabel yang digunakan
        private double biaya;
        private Customer pelanggan;
        private String nama_pelanggan;
        private TipeKamar tipe_kamar;
        private boolean isDiproses;
        private boolean isSelesai;
        private Room kamar;
    /**
     * Constructor berisi object pada class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        // initialise instance variables
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        nama_pelanggan = pelanggan.getNama();
    }
    public double getBiaya(){
        return biaya;
    }
    public Customer getPelanggan(){
        return pelanggan;
    }
    public String getNamaPelanggan(){
        return nama_pelanggan;
    }
    public TipeKamar getTipeKamar(){
        return tipe_kamar;
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
    public void setBiaya(double biaya){
        this.biaya = biaya;
    }
    public void setPelanggan(Customer baru){
        pelanggan = baru;
    }
    public void setNamaPelanggan(String nama_pelanggan){
        this.nama_pelanggan = nama_pelanggan;
    }
    public void setTipeKamar(TipeKamar tipe_kamar){
        this.tipe_kamar = tipe_kamar;
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
    /**
     * Method untuk menampilkan detail pesanan kamar hotel
     */
    public void printData()
    {
       System.out.println("\nDetail Pesanan");
       System.out.println("Nama Pelanggan\t: " + nama_pelanggan);
       System.out.println("Tipe Kamar\t: " + tipe_kamar);
       System.out.println("Status Pemesanan Diproses: " + isDiproses);
       System.out.println("Status Pemesanan Selesai: " + isSelesai);
    }
}
    
    
