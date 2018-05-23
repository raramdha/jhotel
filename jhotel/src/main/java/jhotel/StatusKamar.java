package jhotel;
/**
 * Enumeration class StatusKamar berisi status kamar yang 
 * tersedia di Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (12 Mei 2018)
 */
public enum StatusKamar
{
    //variabel-variabel yang digunakan
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String deskripsi;

    /**
     * Method untuk mengambil status kamar hotel
     *
     * @param deskripsi (status kamar)
     */
    StatusKamar(String deskripsi){
        this.deskripsi = deskripsi;
    }

    /**
     * Method untuk menampilkan detail status kamar hotel
     */
    public String toString(){
        return deskripsi;
    }
}
    
