package com.threads;


/**
 * output is not inconsistent.Second thread executes after finishing the first one
 */
class TableSyn {

    /**
     * Print Thread Method - Synchronized
     *
     * @param n
     * @param threadName
     */
    synchronized void printTable(int n, String threadName) {
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
 * Class MyThreadSyn1
 */
class MyThreadSyn1 extends Thread {
    TableSyn t;

    MyThreadSyn1(TableSyn t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5, "MyThreadSyn1");
    }

}

/**
 * Class MyThreadSyn2
 */
class MyThreadSyn2 extends Thread {
    TableSyn t;

    MyThreadSyn2(TableSyn t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100, "MyThreadSyn2");
    }
}

public class WithSynchronization {

    public static void main(String args[]) {
        TableSyn obj = new TableSyn(); //Have to create only one table object
        MyThreadSyn1 t1 = new MyThreadSyn1(obj);
        MyThreadSyn2 t2 = new MyThreadSyn2(obj);
        t1.start();
        t2.start();
    }
}

