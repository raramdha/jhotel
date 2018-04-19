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
        if(PESANAN_DATABASE.size() == 0){
            baru.setID(LAST_PESANAN_ID+1);
            LAST_PESANAN_ID++;
            PESANAN_DATABASE.add(baru);
            return true;
        }
        else {
            for (Pesanan lama : PESANAN_DATABASE) {
                if (lama.getPelanggan().equals(baru.getPelanggan()) && lama.getStatusAktif()) {
                    throw new PesananSudahAdaException(baru);
                }
                PESANAN_DATABASE.add(baru);
                LAST_PESANAN_ID = baru.getID();
                return true;
            }
        }
        throw new PesananSudahAdaException(baru);
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
            if (pesandb == pesan) {
                if (pesan.getRoom() != null) {
                    pesan.setStatusAktif(false);
                    PESANAN_DATABASE.remove(pesandb);
                    return true;
                }
                else if (pesan.getRoom() == null) {
                    if(pesan.getStatusAktif() == true){
                        pesan.setStatusAktif(false);
                        PESANAN_DATABASE.remove(pesandb);
                        return true;
                    }
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
            if (pesan.getPelanggan() == pelanggan) {
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
            if (pesan.getRoom() == kamar) {
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
