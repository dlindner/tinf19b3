package de.dhbw.tinf19b3.refactoring;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Map<String, Consumer<String[]>> wochentage = new HashMap<>();
		wochentage.put("Montag", array -> System.out.println("Start der Woche"));
		wochentage.put("Dienstag", a -> {
			System.out.println("Start der Woche");
			System.out.println("Start der Woche");
			System.out.println("Start der Woche");
			System.out.println("Start der Woche");
		});
		wochentage.put("Mittwoch", x -> System.out.println("Start der Woche"));
		wochentage.put("Donnerstag", it -> System.out.println("Start der Woche"));
		wochentage.put("Freitag", i -> System.out.println("Start der Woche"));
		
		String unserTag = "Dienstag";
		wochentage.get(unserTag).accept(args);
	}
}
