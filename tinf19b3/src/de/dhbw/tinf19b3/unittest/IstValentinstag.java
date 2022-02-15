package de.dhbw.tinf19b3.unittest;

import java.time.LocalDate;
import java.time.Month;

public final class IstValentinstag {

	private IstValentinstag() {
		super();
	}
	
	public static boolean am(
			LocalDate tag) {
		return ((tag.getDayOfMonth() == 14)
				&& (tag.getMonth() == Month.FEBRUARY));
	}
}
