package app.util;

import app.view.*;

public class Main {
    public static void main(String[] args) {
    	Login login = new Login();
    	login.setVisible(true);
    	
        Link linkObj = new Link();
        linkObj.connect(); // Starts the connection before starting the threads;
        
        
        
        Producer producer = new Producer(linkObj);
        Thread pThread = new Thread(producer);
        
        Common common = new Common();
        
        Consumer consumer = new Consumer(linkObj, common);
        Thread cThread = new Thread(consumer);
        
        pThread.start();
        cThread.start();
    }
}
