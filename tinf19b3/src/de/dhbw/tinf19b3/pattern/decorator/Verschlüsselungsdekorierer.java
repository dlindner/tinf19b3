package de.dhbw.tinf19b3.pattern.decorator;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Verschlüsselungsdekorierer extends Datenübertragungsdekorierer {
	
	public Verschlüsselungsdekorierer(
			Datenübertragung nachfolger) {
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
