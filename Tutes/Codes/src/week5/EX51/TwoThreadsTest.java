package week5.EX51;

/**
 * Class to check two threads
 */
class TwoThreadsTest {

    /**
     * Main Method
     *
     * @param args
     */
    public static void main(String args[]) {

        Thread firstThrd;
        Thread secondThrd;
        Thread thirdThrd;
        Thread fourthThrd;

        firstThrd = new SimpleThread("FirstThread", 2);
        secondThrd = new SimpleThread("SecondThread", 5);
        thirdThrd = new SimpleThread("ThirdThread", 8);
        fourthThrd = new SimpleThread("FourthThread", 11);


        System.out.println("State of the FirstThread Before Start: " + firstThrd.getState());
        firstThrd.start();
        System.out.println("FirstThread is Running");
        System.out.println("State of the FirstThread After Start: " + firstThrd.getState());

        System.out.println("State of the SecondThread Before Start: " + secondThrd.getState());
        secondThrd.start();
        System.out.println("SecondThread is Running");
        System.out.println("State of the SecondThread After Start: " + secondThrd.getState());

        System.out.println("State of the ThirdThread Before Start: " + thirdThrd.getState());
        thirdThrd.start();
        System.out.println("ThirdThread is Running");
        System.out.println("State of the ThirdThread After Start: " + thirdThrd.getState());

        System.out.println("State of the FourthThread Before Start: " + fourthThrd.getState());
        fourthThrd.start();
        System.out.println("FourthThread is Running");
        System.out.println("State of the FourthThread After Start: " + fourthThrd.getState());
    }


    //Q1 - What affect does this have on how the program is executed?
    //Answer - All the threads are executing in parallel

}