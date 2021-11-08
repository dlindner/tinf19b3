package de.dhbw.tinf19b3.principles.isp;

public class Ackergaul implements LebendesArbeitstier {
	
	public Ackergaul() {
		super();
	}
	
	@Override
	public void arbeite() {
		System.out.println("ächz");
	}
	
	@Override
	public void esse() {
		System.out.println("mampf");
	}
	
	@Override
	public void schlafe() {
		System.out.println("gähn");
	}
}
