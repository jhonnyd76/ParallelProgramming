package net.scriptsource;

public class Consumer extends Company{

    public Consumer(String name, Store store) {
        super(name, store);
    }

    public void consume(){
        Object item = new Object();
        store.removeItem(item, 2);
    }
}
