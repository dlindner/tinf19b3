package de.dhbw.tinf19b3.intro;

public class Main {

	public static void main(String[] arguments) {
		Teslaauto meinAuto = new Teslaauto();
		Teslamensch meinErfinder = new Teslamensch();
		
		meinAuto.gebeAuslauf();
		meinErfinder.gebeAuslauf();
		
		Tesla[] meineTeslas = new Tesla[2];
		meineTeslas[0] = meinAuto;
		meineTeslas[1] = meinErfinder;
		
		for (Tesla each : meineTeslas) {
			each.gebeAuslauf();
		}
		
		Garage meineGarage = new Garage();
		
		meineGarage.parke(meinAuto);
		meineGarage.parke(meinErfinder);
		
		for (Tesla each : meineTeslas) {
			meineGarage.parke(each);
		}
	}
}
