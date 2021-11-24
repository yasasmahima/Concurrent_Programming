package week5.EX51;

/**
 * Class which extends the thread class
 */
class SimpleThread extends Thread {
    private final int OneSecond = 1000;
    private int time = 1;

    /**
     * Constructor
     *
     * @param str
     * @param time
     */
    public SimpleThread(String str, int time) {
        super(str);
        this.time = time;
    }

    /**
     * Thread run method
     */


    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
            try {
                sleep((int) (Math.random() * OneSecond * time));
            } catch (InterruptedException e) {
            }
        }
    }
}