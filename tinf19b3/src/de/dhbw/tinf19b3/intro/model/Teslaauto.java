package de.dhbw.tinf19b3.intro.model;

import de.dhbw.tinf19b3.intro.model.generic.Tesla;

public class Teslaauto extends Tesla {
	
	public Teslaauto() {
		super();
	}
	
	@Override
	public void gebeAuslauf() {
		System.out.println("T2: Ich fahre bis zum Horizont und darüber hinaus! Freiheit!");
	}
}
