package com.abstractFactory;

public class SportsOutlet {
	private Bat bat;
	private Racket ball;

	public SportsOutlet(SportsFactory factory) {
		bat = factory.createBat();
		ball = factory.createRacket();
	}

	public void paint() {
		bat.createBat();
		ball.createRacket();
	}

}
