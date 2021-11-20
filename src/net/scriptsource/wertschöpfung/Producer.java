package net.scriptsource.wertschöpfung;

public class Producer extends Company{

    public Producer(String name, Store store){
        super(name, store);
    }

    public void run(){
        while (!interrupted()){
            produce();
        }
    }

    public void produce(){
        Object item = new Object();
        store.addItem(item,1);
    }
}
