package de.dhbw.tinf19b3.clean;

import de.dhbw.tinf19b3.clean.interfaces.Elektroauto;
import de.dhbw.tinf19b3.clean.interfaces.Parkmöglichkeit;

public class MeineMobilität {

	private Elektroauto auto;
	private Parkmöglichkeit zuhause;

	public MeineMobilität(
			Elektroauto auto,
			Parkmöglichkeit zuhause) {
		this.auto = auto;
		this.zuhause = zuhause;
	}
	
	public void führeDurch() {
		auto.parkeIn(zuhause);
		zuhause.lade(auto);
	}
}
