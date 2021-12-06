package de.dhbw.tinf19b3.pattern.decorator;

public class AudioDaten�bertragung implements Daten�bertragung {
	
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
