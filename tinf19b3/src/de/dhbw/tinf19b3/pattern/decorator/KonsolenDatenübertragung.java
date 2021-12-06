package de.dhbw.tinf19b3.pattern.decorator;

public class KonsolenDatenübertragung implements Datenübertragung {
	
	@Override
	public void sende(
			String nachricht) {
		System.out.println(nachricht);
	}
}
