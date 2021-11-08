package de.dhbw.tinf19b3.principles.isp;

/**
 * https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 */
public class BoundedTypes {

	public static void main(String[] args) {
		Arbeitstier typ1 = erstelleArbeiter();
		Lebewesen typ2 = erstelleArbeiter();
		
		typ1.arbeite();
		typ2.esse();
	}
	
	private static <UNION extends Arbeitstier & Lebewesen> UNION erstelleArbeiter() {
		return (UNION) new Ackergaul();
	}
}
