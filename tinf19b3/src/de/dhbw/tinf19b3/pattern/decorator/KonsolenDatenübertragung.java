package de.dhbw.tinf19b3.pattern.decorator;

public class KonsolenDaten�bertragung implements Daten�bertragung {
	
	@Override
	public void sende(
			String nachricht) {
		System.out.println(nachricht);
	}
}
