
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
    
    private String tipe_kamar;
    
    TipeKamar(String tipe_kamar){
        this.tipe_kamar = tipe_kamar;
    }
    
    public String toString(){
        return tipe_kamar;
  
    }
}
