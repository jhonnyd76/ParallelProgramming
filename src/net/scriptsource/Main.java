package net.scriptsource;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread1 = new MyThread("MyThread1");
        MyThread thread2 = new MyThread("Thread2");
        MyThread thread3 = new MyThread("Thread3");
        MyThread thread4 = new MyThread("Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(2000);
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(Thread.currentThread().getName()+": Applikation beendet");

    }
}
