package de.dhbw.tinf19b3.unittest;

public class RömischenZiffern {

	public static String fürDie(int zahl) {
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
