package de.dhbw.tinf19b3.unittest;

public class R�mischenZiffern {

	public static String f�rDie(int zahl) {
		String result = "";
		if (4 == zahl) {
			return "IV";
		}
		for (int i = 0; i < zahl; i++) {
			result += "I";
		}
		return result;
	}
}
