package de.dhbw.tinf19b3.pattern.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Komprimierungsdekorierer extends Datenübertragungsdekorierer {
	
	private static final String encoding = "utf-8";

	public Komprimierungsdekorierer(
			Datenübertragung nachfolger) {
		super(nachfolger);
	}
	
	@Override
	public void sende(
			String nachricht) {
		// try-with-resources
		try (
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			GZIPOutputStream gzip = new GZIPOutputStream(out);
		) {
		    gzip.write(nachricht.getBytes(encoding));
		    String komprimiert = out.toString(encoding);
		    super.sende(komprimiert);
		} catch (IOException e) {
			return;
		}
	}
}
