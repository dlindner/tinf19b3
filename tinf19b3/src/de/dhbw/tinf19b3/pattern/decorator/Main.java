package de.dhbw.tinf19b3.pattern.decorator;

public class Main {

	public static void main(
			String[] args) {
		Datenübertragung gesungen = new AudioDatenübertragung();
		Datenübertragung konsole = new KonsolenDatenübertragung();
		Rückwärtsdekorierer rückwärts = new Rückwärtsdekorierer(
				konsole);
		Verschlüsselungsdekorierer geheim = new Verschlüsselungsdekorierer(
				rückwärts);
		Komprimierungsdekorierer komprimiert = new Komprimierungsdekorierer(
				geheim);
		Verschlüsselungsdekorierer geheim2 = new Verschlüsselungsdekorierer(
				komprimiert);
		Komprimierungsdekorierer komprimiert2 = new Komprimierungsdekorierer(
				geheim2);
		Verschlüsselungsdekorierer geheim3 = new Verschlüsselungsdekorierer(
				komprimiert2);
		Komprimierungsdekorierer komprimiert3 = new Komprimierungsdekorierer(
				geheim3);
		
		Datenübertragung sendung = komprimiert3;
		
		sendung.sende("Hello, world!");
	}
}
