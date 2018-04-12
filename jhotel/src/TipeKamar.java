
/**
 * Enumeration class TipeKamar berisi tipe-tipe kamar yang
 * tersedia di Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (10 Maret 2018)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"),Premium("Premium");
    
    private String deskripsi;
    
    TipeKamar(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String toString(){
        return deskripsi;
  
    }
}
