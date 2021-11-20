package net.scriptsource;

public class Producer extends Company{

    public Producer(String name, Store store){
        super(name, store);
    }
    public void produce(){
        Object item = new Object();
        store.addItem(item,1);
    }
}
