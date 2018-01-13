package com.abstractFactory;

public class Client {
	  private static SportsOutlet configureApplication() {
		  SportsOutlet app;
	        SportsFactory factory;
	        
	        String sportsName = "Adidas".toLowerCase();
	        if (sportsName.contains("Adidas")) {
	            factory = new AdidasFactory();
	            app = new SportsOutlet(factory);
	        } else {
	            factory = new FilaFactory();
	            app = new SportsOutlet(factory);
	        }
	        return app;
	    }

	    public static void main(String[] args) {
	        SportsOutlet app = configureApplication();
	        app.paint();
	    }

}
