/**
 * Class RunForYourLife menggambarkan fungsi threading yang digunakan
 * pada perlombaan lari
 *
 * @author (Ramdhaidfitri Martmis)
 * @version (21 April 2018)
 *
 */

public class RunForYourLife implements Runnable {
    //instance variables
    private String threadName;
    private int delay;

    //Constructor
    public RunForYourLife(String name, int delay){
        threadName = name;
        this.delay = delay;
        System.out.println(name + ", ready.");
    }

    /**
     * Method getter untuk nama pelari (thread)
     *
     * @return  threadName
     */
    public String getThreadName(){
        return threadName;
    }
    /**
     * Method setter untuk nama pelari (thread)
     *
     * @param  name
     */
    public void setThreadName(String name){
        threadName = name;
    }

    /**
     * Method getter untuk lama delay
     *
     * @return delay
     */
    public int getDelay() {
        return delay;
    }
    /**
     * Method setter untuk lama delay
     *
     * @param delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    //Method start untuk membuat thread pelari dalam kondisi set
    public void start(){
        System.out.println(threadName + ", set...");
        (new Thread(this, threadName)).start();
    }

    //Method run untuk menjalankan lomba lari
    public void run() {
        int checkpoint = 20;
        System.out.println(threadName + ", go!");
        for(int i = 0; i < checkpoint; i++){
            System.out.println(threadName + " has passed checkpoint (" + (i+1) +")");
            try{
                Thread.sleep(delay);
            }
            catch(InterruptedException ex){
                System.out.println(threadName + " was interrupted.");
            }

        }
        System.out.println(threadName + " has finished!");
    }
}
