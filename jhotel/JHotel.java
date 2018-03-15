
/**
 * Class JHotel berisi method main untuk memanggil tiap proses
 * yang dapat dilakukan pada Hotel
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (1- Maret 2018)
 */
public class JHotel
{
    /**
     * Constructor untuk object dari class JHotel
     */
    public JHotel(){
        
    }
    /**
     * Method untuk memanggil proses apapun terhadap Hotel
     * 
     * @param argumen denan tipe data String
     */
    public static void main(String args[])
    {
        Lokasi lokasi1 = new Lokasi(100,450, "Jakarta");
        Hotel hotel1 = new Hotel("Hyatt", lokasi1, 5);
        Room sroom1 = new SingleRoom(hotel1, "2301", true, 
        StatusKamar.Booked);
        Customer cust1 = new Customer(1,"Ramdha");
        Pesanan pesan1 = new Pesanan(3, cust1, sroom1);
        
        sroom1.setDailyTariff(700000);
        pesan1.setBiaya();
        
        System.out.println("Welcome to JHotel!");
        lokasi1.printData();
        cust1.printData();
        hotel1.printData();
        
        System.out.println("\n============Melakukan pesanan Single Room============"); 
        Administrasi.pesananDitugaskan(pesan1, sroom1);
        sroom1.printData();
        pesan1.printData();
        
        
        if(sroom1 instanceof DoubleRoom){
            System.out.println("Benar Double Room"); }
        else {
            System.out.println("Salah, bukan Double Room"); }
        
        Room droom1 = new DoubleRoom(hotel1, "2398", true, 
        StatusKamar.Booked);
        Pesanan pesan2 = new Pesanan(5, cust1, droom1);
        droom1.setDailyTariff(900000);
        pesan2.setBiaya();
        
        System.out.println("\n============Melakukan pesanan Double Room============"); 
        Administrasi.pesananDitugaskan(pesan2, droom1);
        droom1.printData();
        pesan2.printData();
        
        if(droom1 instanceof DoubleRoom){
            System.out.println("Benar Double Room"); }
        else {
            System.out.println("Salah, bukan Double Room"); }
        
    }
}

