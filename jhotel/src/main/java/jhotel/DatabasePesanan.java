package jhotel;
import java.util.*;
/**
 * Class DatabasePesanan menggambarkan detail dari
 * cara-cara memodifikasi data Pesanan
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public class DatabasePesanan
{
    //variabel-variabel yang digunakan
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID;
    /**
     * Constructor berisi object dari class DatabasePesanan
     */
    public DatabasePesanan()
    {
        // initialise instance variables
    }
    
    /**
     * Method untuk menambahkan Pesanan baru ke dalam
     * database Pesanan
     * 
     * @return  default dari tipe data boolean
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }

    /**
     * Method untuk menghapus Pesanan dari
     * database Pesanan
     * 
     * @return  default dari tipe data boolean
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        for (Pesanan pesandb : PESANAN_DATABASE) {
            if (pesan.equals(pesandb)) {
                if (pesan.getRoom() != null) {
                    Administrasi.pesananDibatalkan(pesan);
                }
                else if (pesan.getStatusAktif() == true){
                    pesan.setStatusAktif(false);
                    PESANAN_DATABASE.remove(pesandb);
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }

    /**
     * Method untuk mengambil data Pesanan dari database
     * 
     * @return  default dari tipe data Pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan){
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true) {
                return pesan;
            }
        }
        return null;

    }
    public static Pesanan getPesanan(int id)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (pesan.getID() == id) {
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar)
    {
        for (Pesanan pesan : PESANAN_DATABASE) {
            if (kamar.equals(pesan.getRoom()) == true) {
                return pesan;
            }
        }
        return null;
    }
    /**
     * Method untuk mengambil isi database Pesanan
     * 
     * @return  default dari tipe data String
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }




}
