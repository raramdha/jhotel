
/**
 * Enumeration class Statuskamar - write a description of the enum class here
 *
 * @author (Ramdhaidfitri M)
 * @version (8 Maret 2018)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    
    private String status;
    
    StatusKamar(String status){
        this.status = status;
    }
    
    public String toString(){
        return status;
    }
}
    
