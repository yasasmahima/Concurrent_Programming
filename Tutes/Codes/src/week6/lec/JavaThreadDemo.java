package week6.lec;

public class JavaThreadDemo implements Runnable {
    public static Thread thread1;
    public static JavaThreadDemo obj;

    public static void main(String[] args) {
        obj = new JavaThreadDemo();
        thread1 = new Thread(obj);

        System.out.println("State of thread 1 after crating it [Before start] : " + thread1.getState());

        thread1.start();

        System.out.println("State of thread 1 after calling start() method : " + thread1.getState());

    }


    @Override
    public void run() {

        SimpleThread myThread = new SimpleThread();
        Thread thread2 = new Thread(myThread);

        System.out.println("Start of thread 2 after crating it [Before Start] : " + thread2.getState());

        thread2.start();

        System.out.println("State of thread 2 after calling start() method : " + thread2.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of the thread 2 after sleep() method : " + thread2.getState());


        try {
//            Wait for thread 2 to die
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of the thread 2 after it finished its execution : " + thread2.getState());

    }
}
