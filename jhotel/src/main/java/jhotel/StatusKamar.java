package jhotel;
/**
 * Enumeration class StatusKamar berisi status kamar yang 
 * tersedia di Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String deskripsi;
    
    StatusKamar(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String toString(){
        return deskripsi;
    }
}
    
