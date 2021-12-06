package de.dhbw.tinf19b3.pattern.decorator;

public abstract class Datenübertragungsdekorierer implements Datenübertragung {
	
	private final Datenübertragung nachfolger;

	public Datenübertragungsdekorierer(
			Datenübertragung nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void sende(
			String nachricht) {
		this.nachfolger.sende(nachricht);
	}
}
