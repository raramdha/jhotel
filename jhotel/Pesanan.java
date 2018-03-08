
/**
 * Write a description of class Pesanan here.
 *
 * @author (Ramdhaidfitri M)
 * @version (28 February 2018)
 */
public class Pesanan
{
    // nstance variables - replace the example below with your own
        private double biaya;
        private Customer pelanggan;
        private String nama_pelanggan;
        private String jenis_kamar;
        private boolean isDiproses;
        private boolean isSelesai;
        private Room kamar;
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        // initialise instance variables
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void Pesanan()
    {
        // put your code here
    }
    public double getBiaya(){
        return biaya;
    }
    public Customer getPelanggan(){
        return pelanggan;
    }
    public boolean getStatusDiproses(){
        return isDiproses;
    }
    public boolean getStatusSelesai(){
        return isSelesai;
    }
    public Room getRoom(){
        return kamar;
    }
    public void setBiaya(double biaya){
        this.biaya = biaya;
    }
    public void setPelanggan(Customer baru){
        pelanggan = baru;
    }
    public void setStatusDiproses(boolean diproses){
        isDiproses = diproses;
    }
    public void setStatusSelesai(boolean diproses){
        isSelesai = diproses;
    }
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    public void printData()
    {
       System.out.println(biaya);
    }
}
    
    
