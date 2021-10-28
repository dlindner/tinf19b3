package de.dhbw.tinf19b3.intro.model;

import de.dhbw.tinf19b3.intro.model.generic.Tesla;

public class Teslamensch extends Tesla {
	
	public Teslamensch() {
		super();
	}
	
	@Override
	public void gebeAuslauf() {
		System.out.println("T3: Ich prelle das nächste Restaurant.");
	}
}
