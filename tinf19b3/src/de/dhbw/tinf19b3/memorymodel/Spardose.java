package de.dhbw.tinf19b3.memorymodel;

public class Spardose {

	private int menge;
	
	public Spardose() {
		super();
		this.menge = 0;
	}
	
	public void einwerfen(Euro geldstück) {
		this.menge = this.menge + 1;
	}
	
	@Override
	public String toString() {
		return "Geld in Dose: " + this.menge;
	}
}
