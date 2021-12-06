package de.dhbw.tinf19b3.pattern.decorator;

public class AudioDatenübertragung implements Datenübertragung {
	
	@Override
	public void sende(
			String nachricht) {
		for (char each : nachricht.toCharArray()) {
			int alsInt = (int) each;
			int frequenz = alsInt * 20;
			System.out.println(frequenz);
		}
	}
}
