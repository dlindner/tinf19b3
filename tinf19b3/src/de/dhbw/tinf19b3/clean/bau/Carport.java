package de.dhbw.tinf19b3.clean.bau;

import java.util.Optional;

import de.dhbw.tinf19b3.clean.interfaces.Elektroauto;
import de.dhbw.tinf19b3.clean.interfaces.Parkmöglichkeit;

public class Carport implements Parkmöglichkeit {

	@Override
	public void lade(Elektroauto fahrzeug) {
		// does something
	}
	
	public Optional<Elektroauto> gibAuto() {
		return Optional.empty();
		//return Optional.of(geparktesAuto);
	}
}
