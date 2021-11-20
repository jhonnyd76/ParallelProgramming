package net.scriptsource.wertschöpfung;

public abstract class Company extends Thread{
    //protected String name;
    protected Store store;

    public Company(String name, Store store){
        super(name);
        this.store = store;
    }


}
