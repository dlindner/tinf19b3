package de.dhbw.tinf19b3.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		MySingleton.getInstance().random();
		//MySingleton.random();
		
		MyRealSingleton.TOBIAS.random();
	}
}
