package de.dhbw.tinf19b3.clean;

import java.util.Optional;

import de.dhbw.tinf19b3.clean.bau.Carport;
import de.dhbw.tinf19b3.clean.fahrzeug.Porsche;
import de.dhbw.tinf19b3.clean.interfaces.Elektroauto;

public class Main {

	public static void main(String[] arguments) {
		Elektroauto meinAuto = new Porsche();
		MeineMobilität mobil = new MeineMobilität(
				meinAuto,
				new Carport());
		mobil.führeDurch();
		
		Optional<Elektroauto> maybeAuto = new Carport().gibAuto();
		maybeAuto.isEmpty();
		maybeAuto.isPresent();
		maybeAuto.ifPresent(auto -> auto.parkeIn(new Carport()));
		String name = maybeAuto.map(auto -> auto.toString()).orElse("kein Auto");
		maybeAuto.map(Elektroauto::toString).orElseThrow();
	}
}
