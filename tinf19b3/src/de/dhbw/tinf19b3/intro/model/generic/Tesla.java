package de.dhbw.tinf19b3.intro.model.generic;

import de.dhbw.tinf19b3.intro.model.Garage;

public abstract class Tesla {

	public Tesla() {
		super();
	}
	
	public void gebeAuslauf() {
		System.out.println("T1: Bewege mich im Kreis");
		Garage garage = new Garage();
	}
}
