package app.util;

import app.view.*;

public class Main {
	/* Variables:
	==================================================================================*/
		private static Login login;
		private static Link link;
		private static Room room;
		private static Common common;
		private static Producer producer;
		private static Thread producerT;
		private static Thread consumer;
		
	/* Main:
	==================================================================================*/
	    public static void main(String[] args) {
	    	createElements();
	    	startMethods();
	    	startThreads();
	    }
    
    /* Create Elements Method:
	==================================================================================*/
	    private static void createElements() {
	    	link = new Link();
	    	producer = new Producer(link);
	    	producerT = new Thread(producer);
	    	room = new Room();
	    	common = new Common(producer, room);
	    	
	    	consumer = new Thread(new Consumer(link, common));
	    	login = new Login(common, consumer);
	    	
	    	
	    }
	    
    /* Start Methods Method:
	==================================================================================*/
	    private static void startMethods() {
	    	link.connect();
	    	login.setVisible(true);
	    }
	    
    /* Start Threads Method:
	==================================================================================*/
	    private static void startThreads() {
	    	producerT.start();
	    }
}
