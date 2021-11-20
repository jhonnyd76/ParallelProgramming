package net.scriptsource.wertschöpfung;

public class Consumer extends Company{

    public Consumer(String name, Store store) {
        super(name, store);
    }

    public void run(){
        while (!interrupted()) {
            consume();
        }
    }
    public void consume(){
        Object item = new Object();
        store.removeItem(item, -2);
    }
}
