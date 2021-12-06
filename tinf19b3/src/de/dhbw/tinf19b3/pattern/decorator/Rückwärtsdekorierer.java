package de.dhbw.tinf19b3.pattern.decorator;

public class R�ckw�rtsdekorierer extends Daten�bertragungsdekorierer {
	
	public R�ckw�rtsdekorierer(
			Daten�bertragung nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void sende(
			String nachricht) {
		StringBuilder buffer = new StringBuilder(nachricht);
		super.sende(buffer.reverse().toString());
	}
}
