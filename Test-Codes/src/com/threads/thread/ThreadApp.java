package com.threads.thread;


class MainThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("This Code is Running in the Class which Extends Thread ==> ");
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Best Pracice
class MainRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print("This Code is Running in the Class which implements Runnable ==> ");
                System.out.println(i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadApp {

    //Runnable
    public static void main(String[] args) {
        MainRunnable obj = new MainRunnable();
        Thread thread = new Thread(obj);
        thread.start();

        System.out.println("First Run the Main method thread\n\n");

        MainThread mainThread = new MainThread();
        mainThread.start();

    }
}


