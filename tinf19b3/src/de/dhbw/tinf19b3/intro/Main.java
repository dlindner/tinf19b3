package de.dhbw.tinf19b3.intro;

import java.util.Arrays;
import java.util.List;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final Tesla meinAuto = new Teslaauto();
		final Teslamensch meinErfinder = new Teslamensch();
		
		meinAuto.gebeAuslauf();
		meinErfinder.gebeAuslauf();
		
		final List<Tesla> meineTeslas = Arrays.asList(
				meinAuto,
				meinErfinder);

		//meineTeslas.forEach(t -> t.gebeAuslauf());
		meineTeslas.forEach(Tesla::gebeAuslauf);
		for (Tesla each : meineTeslas) {
			each.gebeAuslauf();
		}

		for (Tesla each : meineTeslas) {
			if (each instanceof Teslaauto) {
				System.out.println("T2: Ich fahre bis zum Horizont und darüber hinaus! Freiheit!");
			} else {
				System.out.println("T3: Ich prelle das nächste Restaurant.");
			}
		}
		
		final Garage meineGarage = new Garage();
		
		meineGarage.parke(meinAuto);
		meineGarage.parke(meinErfinder);
		
		meineTeslas.forEach(meineGarage::parke);
	}
}
