package de.dhbw.tinf19b3.intro;

public class Garage {

	public Garage() {
		super();
	}
	
	public void parke(Tesla tesla) {
		System.out.println("G1: Es wird knapp, aber es passt.");
	}
	
	public void parke(Teslaauto auto) {
		System.out.println("G2: Es riecht überhaupt nicht eklig!");
	}
	
	public void parke(Teslamensch mensch) {
		System.out.println("G3: Ist nur vorrübergehend, mein Freund.");
	}
}
