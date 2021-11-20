package net.scriptsource.wertschöpfung;

public class Store {
    private static int counter;

    public Store(){
        counter = 0;
    }

    public synchronized void addItem(Object item, int i){
        Object addItem = item;
        counter += i;
        System.out.println(Thread.currentThread().getName()+ " hat " + i + " " + item + " eingelagert, \nLagerbestand: " + counter + "!");
    }

    public synchronized void removeItem(Object item, int i){
        Object removeItem = item;
        counter += i;
        System.out.println(Thread.currentThread().getName()+ " hat " + i + " " + item + " ausgelagert, \nLagerbestand: " + counter + "!");
    }
}
