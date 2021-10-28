package de.dhbw.tinf19b3.clean;

import java.util.Optional;

import de.dhbw.tinf19b3.clean.bau.Carport;
import de.dhbw.tinf19b3.clean.fahrzeug.Porsche;
import de.dhbw.tinf19b3.clean.interfaces.Elektroauto;

public class Main {

	public static void main(String[] arguments) {
		Elektroauto meinAuto = new Porsche();
		MeineMobilit�t mobil = new MeineMobilit�t(
				meinAuto,
				new Carport());
		mobil.f�hreDurch();
		
		Optional<Elektroauto> maybeAuto = new Carport().gibAuto();
		maybeAuto.isEmpty();
		maybeAuto.isPresent();
		maybeAuto.ifPresent(auto -> auto.parkeIn(new Carport()));
		String name = maybeAuto.map(auto -> auto.toString()).orElse("kein Auto");
		maybeAuto.map(Elektroauto::toString).orElseThrow();
	}
}
