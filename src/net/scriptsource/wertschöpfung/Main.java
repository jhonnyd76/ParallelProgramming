package net.scriptsource.wertschöpfung;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Store store = new Store();
        List<Producer> producers = new ArrayList<>();
        List<Consumer> consumers = new ArrayList<>();
        for(int i = 0;i<9;i++){
            producers.add(new Producer("Producer " +i, store));
        }
        for(int i = 0; i<6;i++){
            consumers.add(new Consumer("Consumer " + i,store));
        }
        producers.forEach(p -> p.start());
        consumers.forEach(p->p.start());
        Thread.sleep(10000);
        producers.forEach(p->p.interrupt());
        consumers.forEach(p->p.interrupt());

    }
}
