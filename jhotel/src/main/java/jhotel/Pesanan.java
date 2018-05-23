package jhotel;
/**
 * Class Hotel menggambarkan detail dari pesanan pada kamar Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class Pesanan {
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
    public Pesanan(double jumlahHari, Customer pelanggan) {
        isAktif = true;
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        //this.biaya = jumlahHari * getRoom().getDailyTariff();
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID() + 1;
    }

    /**
     * Method untuk mengambil id Pesanan dalam bentuk integer
     *
     * @return  id pesanan
     */
    public int getID() {
        return id;
    }

    /**
     * Method untuk mengambil biaya pesanan dalam bentuk double
     *
     * @return  biaya sewa kamar hotel
     */
    public double getBiaya() {
        return biaya;
    }

    /**
     * Method untuk mengambil jumlah hari penyewaan kamar dalam bentuk double
     *
     * @return  jumlah hari penyewaan kamar
     */
    public double getJumlahHari() {
        return jumlahHari;
    }

    /**
     * Method untuk mengambil data pelanggan penyewa kamar
     *
     * @return  data pelanggan
     */
    public Customer getPelanggan() {
        return pelanggan;
    }

    /**
     * Method untuk mengambil status aktif penyewaan kamar Hotel
     *
     * @return  status aktif
     */
    public boolean getStatusAktif() {
        return isAktif;
    }

    /**
     * Method untuk mengambil status diproses penyewaan kamar Hotel
     *
     * @return  status diproses
     */
    public boolean getStatusDiproses() {
        return isDiproses;
    }

    /**
     * Method untuk mengambil status selesai penyewaan kamar Hotel
     *
     * @return  status selesai
     */
    public boolean getStatusSelesai() {
        return isSelesai;
    }

    /**
     * Method untuk mengambil kamar Hotel yang akan disewa
     *
     * @return  kamar hotel
     */
    public Room getRoom() {
        return kamar;
    }

    /**
     * Method untuk mengambil tanggal pesan kamar Hotel
     *
     * @return  tanggal pesan
     */
    public Date getTanggalPesan() {
        System.out.println(tanggalPesan.toString());
        return tanggalPesan;
    }

    /**
     * Method untuk menentukan id Pesanan dalam bentuk integer
     *
     * @param id pesanan
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Method untuk menentukan biaya pesanan dalam bentuk double
     *
     */
    public void setBiaya() {
        biaya = kamar.getDailyTariff() * jumlahHari;
    }

    /**
     * Method untuk menentukan jumlah hari penyewaan kamar
     *
     * @param  jumlahHari penyewaan kamar
     */
    public void setJumlahHari(double jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    /**
     * Method untuk menentukan data pelanggan penyewa kamar
     *
     * @param pelanggan
     */
    public void setPelanggan(Customer pelanggan) {
        this.pelanggan = pelanggan;
    }

    /**
     * Method untuk menentukan status aktif penyewaan kamar Hotel
     *
     * @param aktif
     */
    public void setStatusAktif(boolean aktif) {
        this.isAktif = aktif;
    }

    /**
     * Method untuk menentukan status diproses penyewaan kamar Hotel
     *
     * @param diproses
     */
    public void setStatusDiproses(boolean diproses) {
        this.isDiproses = diproses;
    }

    /**
     * Method untuk menentukan status selesai penyewaan kamar Hotel
     *
     * @param selesai
     */
    public void setStatusSelesai(boolean selesai) {
        this.isSelesai = selesai;
    }

    /**
     * Method untuk menentukan kamar Hotel yang akan disewa
     *
     * @param  kamar hotel
     */
    public void setRoom(Room kamar) {
        this.kamar = kamar;
    }

    /**
     * Method untuk menentukan tanggal pesan kamar Hotel
     *
     * @param  tanggalPesan
     */
    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    /**
     * Method untuk menampilkan detail pesanan kamar hotel
     */
    public String toString() {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";

        if(getRoom() == null){
            return ("Dibuat oleh " + pelanggan.getNama() +
                    "\nStatus Pesanan: " + final_status + ".\n");
        }
        else {
            return "\nDibuat oleh " + pelanggan.getNama() +
                    ". \nProses booking untuk hotel " + getRoom().getHotel().getNama()
                    + ", dengan kamar nomor " + getRoom().getNomorKamar()
                    + " dan tipe kamar yang diinginkan " + getRoom().getTipeKamar()
                    + ".\nStatus Pesanan: " + final_status;
        }
    }
}
    
    
