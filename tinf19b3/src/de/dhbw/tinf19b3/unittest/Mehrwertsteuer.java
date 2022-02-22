package de.dhbw.tinf19b3.unittest;

public class Mehrwertsteuer {
	
	public Mehrwertsteuer() {
		super();
	}

	public double fürLebensmittel(double preis) {
		double result = preis * 0.07D;
		System.out.println("Reduzierter Steuersatz: " + result);
		return result;
	}
	
	public double fürAllesSonst(double preis) {
		double result = preis * 0.19D;
		System.out.println("Normaler Steuersatz: " + result);
		return result;
	}
}
