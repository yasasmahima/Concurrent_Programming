package week5.EX52;

/**
 * Writer class. This extends Java Thread class
 */
public class Writer extends Thread {

    /**
     * Variable to store writer name
     */
    private String writerName;
    /**
     * Variable1 to store object from the shared variable
     */
    private SharedVariable variable1;
    /**
     * Variable2 to store the object from shared variable
     */
    private SharedVariable variable2;
    /**
     * Variable to control the number of loop in the for-loop - Start Value
     */
    private int loopControllerStart;
    /**
     * Variable to control the number of loop in the for-loop - End Value
     */
    private int loopControllerEnd;


    /**
     * Parameterised constructor
     *
     * @param writerName
     * @param variable1
     * @param variable2
     * @param loopControllerStart
     */
    public Writer(String writerName, SharedVariable variable1, SharedVariable variable2, int loopControllerStart, int loopControllerEnd) {
        this.writerName = writerName;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.loopControllerStart = loopControllerStart;
        this.loopControllerEnd = loopControllerEnd;
    }

    /**
     * Default constructor
     */
    public Writer() {
    }

    /**
     * Override the run method -  This will assign values to SharedVariable's integerValue
     */
    @Override
    public void run() {
        for (int i = loopControllerStart; i < loopControllerEnd; i++) {
            try {
                variable1.assign(i);
                System.out.println(this.writerName + " assigns variable 1 : " + i);

                variable2.assign(i);
                System.out.println(this.writerName + " assigns variable 2 : " + i);
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
