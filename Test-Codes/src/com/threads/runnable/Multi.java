package com.threads.runnable;

class Multi implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi m1=new Multi();
        Thread t1 =new Thread(m1);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.getState());

    }
}