package net.scriptsource;
public class MyThread extends Thread{
    private static int counter;
    private static Object monitor = new Object();

    public MyThread(String name){
        super(name);
        counter = 0;
    }

    @Override
    public void run(){
        while (!isInterrupted()){
            synchronized (monitor){
                counter++;
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    interrupt();
                }
                System.out.println(getName() + " " + counter);
            }
        }
    }


}
