package com.abstractFactory;

public class FilaFactory implements SportsFactory{

	@Override
	public Bat createBat() {
		// TODO Auto-generated method stub
		return new FilaBat();
	}


	@Override
	public Racket createRacket() {
		// TODO Auto-generated method stub
		return new FilaRacket();
	}
}
