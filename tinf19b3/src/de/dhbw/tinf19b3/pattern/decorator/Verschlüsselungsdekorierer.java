package de.dhbw.tinf19b3.pattern.decorator;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Verschl�sselungsdekorierer extends Daten�bertragungsdekorierer {
	
	public Verschl�sselungsdekorierer(
			Daten�bertragung nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void sende(
			String nachricht) {
		try {
			String geheimeNachricht = Base64.getUrlEncoder()
											.encodeToString(
													nachricht.getBytes("utf-8"));
			super.sende(geheimeNachricht);
		} catch (UnsupportedEncodingException e) {
			return;
		}
	}
}
