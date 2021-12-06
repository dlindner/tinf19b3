package de.dhbw.tinf19b3.pattern.decorator;

public class Rückwärtsdekorierer extends Datenübertragungsdekorierer {
	
	public Rückwärtsdekorierer(
			Datenübertragung nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void sende(
			String nachricht) {
		StringBuilder buffer = new StringBuilder(nachricht);
		super.sende(buffer.reverse().toString());
	}
}
