package com.abstractFactory;

public class AdidasFactory implements SportsFactory{

	@Override
	public Bat createBat() {
		// TODO Auto-generated method stub
		return new AdidasBat();
	}

	@Override
	public Racket createRacket() {
		// TODO Auto-generated method stub
		return new AdidasRacket();
	}

}
