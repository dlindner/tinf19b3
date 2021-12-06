package de.dhbw.tinf19b3.pattern.decorator;

public abstract class Daten�bertragungsdekorierer implements Daten�bertragung {
	
	private final Daten�bertragung nachfolger;

	public Daten�bertragungsdekorierer(
			Daten�bertragung nachfolger) {
		super();
		this.nachfolger = nachfolger;
	}
	
	@Override
	public void sende(
			String nachricht) {
		this.nachfolger.sende(nachricht);
	}
}
