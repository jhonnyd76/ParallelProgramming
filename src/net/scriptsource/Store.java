package net.scriptsource;

public class Store {
    private static int counter;

    public Store(){
        counter = 0;
    }

    public void addItem(Object item, int i){
        Object addItem = item;
        counter += i;
    }

    public void removeItem(Object item, int i){
        Object removeItem = item;
        counter += i;
    }
}
