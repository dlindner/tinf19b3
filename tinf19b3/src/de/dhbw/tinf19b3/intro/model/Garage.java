package de.dhbw.tinf19b3.intro.model;

import de.dhbw.tinf19b3.intro.model.generic.Tesla;

public class Garage {

	public Garage() {
		super();
	}
	
	public void parke(final Tesla tesla) {
		System.out.println("G1: Es wird knapp, aber es passt.");
	}
	
	public void parke(final Teslaauto auto) {
		System.out.println("G2: Es riecht überhaupt nicht eklig!");
	}
	
	public void parke(final Teslamensch mensch) {
		System.out.println("G3: Ist nur vorrübergehend, mein Freund.");
	}
}
