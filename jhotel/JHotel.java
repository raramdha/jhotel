
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
        Customer cust1 = new Customer(1,"Ramdha");
        Lokasi lokasi1 = new Lokasi(100,450, "Jakarta");
        Hotel hotel1 = new Hotel("Hyatt", lokasi1, 5);
        Pesanan pesan1 = new Pesanan(700000, cust1);
        Room kamar1 = new Room(hotel1, "2301", true, cust1, 700000,
        StatusKamar.Booked);
        
        pesan1.setTipeKamar(TipeKamar.Single);
        
        System.out.println("Welcome to JHotel!");
        lokasi1.printData();
        cust1.printData();
        hotel1.printData();
        
        System.out.println("===================Method 1===================="); 
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        kamar1.printData();
        pesan1.printData();
        
        System.out.println("===================Method 2====================");
        Administrasi.pesananDibatalkan(kamar1);
        kamar1.printData();
        pesan1.printData();
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        
        System.out.println("===================Method 3====================");
        Administrasi.pesananDibatalkan(pesan1);
        kamar1.printData();
        pesan1.printData();
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        
        System.out.println("===================Method 4====================");
        Administrasi.pesananSelesai(kamar1);
        kamar1.printData();
        pesan1.printData();
        Administrasi.pesananDitugaskan(pesan1, kamar1);
        
        System.out.println("===================Method 5====================");
        Administrasi.pesananSelesai(pesan1);
        kamar1.printData();
        pesan1.printData();
    }
    
}

