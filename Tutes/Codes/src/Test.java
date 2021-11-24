public class Test implements Runnable {

    public static  Thread testThread;
    public static Test test;

    public static void main(String[] args) {

        test = new Test();
        testThread = new Thread(test);
        System.out.println(testThread.getState());
        testThread.start();
        System.out.println(testThread.getState());



    }
    @Override
    public void run() {


        NewThread thread = new NewThread();
        Thread thread2 = new Thread(thread);
        thread2.start();

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(thread2.getState());

        try {
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class NewThread implements Runnable{

    @Override
    public void run() {
        System.out.println("This is THread 2");


        System.out.println(Test.testThread.getState());
    }
}
