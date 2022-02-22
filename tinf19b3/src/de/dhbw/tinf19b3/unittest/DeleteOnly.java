package de.dhbw.tinf19b3.unittest;

import java.io.File;

public class DeleteOnly {

	private File datei;

	protected DeleteOnly(File datei) {
		super();
		this.datei = datei;
	}

	// named constructor
	public static DeleteOnly ifFile(File datei) {
		return new DeleteOnly(datei);
	}
	
	public void isEmpty() {
		if (!this.datei.exists()) {
			return;
		}
		if (!this.datei.isFile()) {
			return;
		}
		if (this.datei.length() != 0L) {
			return;
		}
		this.datei.delete();
		//this.datei.exists();
	}
}
