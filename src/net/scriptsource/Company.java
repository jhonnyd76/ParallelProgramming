package net.scriptsource;

import java.net.Socket;
import java.net.SocketTimeoutException;

public abstract class Company {
    protected String name;
    protected Store store;

    public Company(String name, Store store){
        this.name = name;
        this.store = store;
    }

    public String getName() {
        return name;
    }
}
