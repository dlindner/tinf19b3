package de.dhbw.tinf19b3.pattern.decorator;

public class Rückwärtsdekorierer extends Datenübertragungsdekorierer {
	
	public Rückwärtsdekorierer(
			Datenübertragung nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void sende(
			String nachricht) {
		// Vor der Endkomponente
		
		StringBuilder buffer = new StringBuilder(nachricht);
		super.sende(buffer.reverse().toString());

		// Nach der Endkomponente
	}
}
