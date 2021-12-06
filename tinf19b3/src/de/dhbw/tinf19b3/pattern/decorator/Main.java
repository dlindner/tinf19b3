package de.dhbw.tinf19b3.pattern.decorator;

public class Main {

	public static void main(
			String[] args) {
		Daten�bertragung gesungen = new AudioDaten�bertragung();
		Daten�bertragung konsole = new KonsolenDaten�bertragung();
		R�ckw�rtsdekorierer r�ckw�rts = new R�ckw�rtsdekorierer(
				konsole);
		Verschl�sselungsdekorierer geheim = new Verschl�sselungsdekorierer(
				r�ckw�rts);
		Komprimierungsdekorierer komprimiert = new Komprimierungsdekorierer(
				geheim);
		Verschl�sselungsdekorierer geheim2 = new Verschl�sselungsdekorierer(
				komprimiert);
		Komprimierungsdekorierer komprimiert2 = new Komprimierungsdekorierer(
				geheim2);
		Verschl�sselungsdekorierer geheim3 = new Verschl�sselungsdekorierer(
				komprimiert2);
		Komprimierungsdekorierer komprimiert3 = new Komprimierungsdekorierer(
				geheim3);
		
		Daten�bertragung sendung = komprimiert3;
		
		sendung.sende("Hello, world!");
	}
}
