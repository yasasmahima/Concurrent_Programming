package com.threads.synchronization;

/**
 * output is inconsistent. Both Threads are run in same time.
 */
class Table {

    /**
     * Print Thread Method - Not Synchronized
     *
     * @param n
     * @param threadName
     */
    void printTable(int n, String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + "\t==>\t" + (n * i));
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

/**
 * Class MyThread1
 */
class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5, "MyThread1");
    }

}

/**
 * Class MyThread2
 */
class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100, "MyThread2");
    }
}

/**
 * Main Class
 */
public class WithoutSynchronization {

    public static void main(String args[]) {
        Table obj = new Table(); //Have to create only one table object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
