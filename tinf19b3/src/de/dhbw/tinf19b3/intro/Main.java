package de.dhbw.tinf19b3.intro;

import java.util.Arrays;
import java.util.List;

import de.dhbw.tinf19b3.intro.model.Garage;
import de.dhbw.tinf19b3.intro.model.Teslaauto;
import de.dhbw.tinf19b3.intro.model.Teslamensch;
import de.dhbw.tinf19b3.intro.model.generic.Tesla;

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
		
		final Garage meineGarage = new Garage();
		
		meineGarage.parke(meinAuto);
		meineGarage.parke(meinErfinder);
		
		meineTeslas.forEach(meineGarage::parke);
	}
}
