package de.dhbw.tinf19b3.clean;

import de.dhbw.tinf19b3.clean.interfaces.Elektroauto;
import de.dhbw.tinf19b3.clean.interfaces.Parkm�glichkeit;

public class MeineMobilit�t {

	private Elektroauto auto;
	private Parkm�glichkeit zuhause;

	public MeineMobilit�t(
			Elektroauto auto,
			Parkm�glichkeit zuhause) {
		this.auto = auto;
		this.zuhause = zuhause;
	}
	
	public void f�hreDurch() {
		auto.parkeIn(zuhause);
		zuhause.lade(auto);
	}
}
