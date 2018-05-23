package jhotel;
/**
 * Enumeration class TipeKamar berisi tipe-tipe kamar yang
 * tersedia di Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public enum TipeKamar
{
    //variabel-variabel yang digunakan
    Single("Single"), Double("Double"),Premium("Premium");
    
    private String deskripsi;

    /**
     * Method untuk mengambil tipe kamar hotel
     *
     * @param  deskripsi (tipe kamar)
     */
    TipeKamar(String deskripsi){
        this.deskripsi = deskripsi;
    }

    /**
     * Method untuk menampilkan detail tipe kamar hotel
     */
    public String toString(){
        return deskripsi;
    }
}
