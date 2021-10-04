package de.dhbw.tinf19b3.intro;

public final class Main {
	
	private Main() {
		super();
	}

	public static void main(final String[] arguments) {
		final Teslaauto meinAuto = new Teslaauto();
		final Teslamensch meinErfinder = new Teslamensch();
		
		meinAuto.gebeAuslauf();
		meinErfinder.gebeAuslauf();
		
		final Tesla[] meineTeslas = new Tesla[2];
		meineTeslas[0] = meinAuto;
		meineTeslas[1] = meinErfinder;
		
		for (final Tesla each : meineTeslas) {
			each.gebeAuslauf();
		}
		
		final Garage meineGarage = new Garage();
		
		meineGarage.parke(meinAuto);
		meineGarage.parke(meinErfinder);
		
		for (final Tesla each : meineTeslas) {
			meineGarage.parke(each);
		}
	}
}
