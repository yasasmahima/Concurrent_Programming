package week5.EX52;

/**
 * Reader class. This is extended by Java Thread class
 */
public class Reader extends Thread {

    /**
     * Variable to store the reader name
     */
    private String readerName;
    /**
     * Variable1 to store the object from shared variable
     */
    private SharedVariable variable1;
    /**
     * Variable2 to store the object from shared variable
     */
    private SharedVariable variable2;
    /**
     * Variable to control the number of loop in the for-loop
     */
    private int loopController;

    /**
     * Parameterised constructor
     *
     * @param readerName
     * @param variable1
     * @param variable2
     * @param loopController
     */
    public Reader(String readerName, SharedVariable variable1, SharedVariable variable2, int loopController) {
        this.readerName = readerName;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.loopController = loopController;
    }

    /**
     * Default constructor
     */
    public Reader() {
    }

    /**
     * Override run method - Read value from the SharedVariable class in each every 1000ms of time.
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(this.readerName + " read variable 1 : " + this.variable1.value());
                System.out.println(this.readerName + " read variable 2 : " + this.variable2.value());
                sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
