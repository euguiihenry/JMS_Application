package app.util;

import app.view.*;

public class Main {
    public static void main(String[] args) {
        Link linkObj = new Link();
        linkObj.connect(); // Starts the connection before starting the threads;
        
        
        
        Producer producer = new Producer(linkObj);
        Thread pThread = new Thread(producer);
        
        TemporaryInterface face = new TemporaryInterface(producer);
        
        Consumer consumer = new Consumer(linkObj, face);
        Thread cThread = new Thread(consumer);
        
        pThread.start();
        cThread.start();
        
        // Every time a new app loads, it should load a new main that will create a new thread for each of them and use them to communicate.
    }
}
