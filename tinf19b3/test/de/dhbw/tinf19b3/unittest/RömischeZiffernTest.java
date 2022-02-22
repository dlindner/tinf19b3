package de.dhbw.tinf19b3.unittest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class R�mischeZiffernTest {

	@Test
	public void dieEins() {
		assertThat(
			R�mischenZiffern.f�rDie(1)
		).isEqualTo("I");
	}

	@Test
	public void dieZwei() {
		assertThat(
			R�mischenZiffern.f�rDie(2)
		).isEqualTo("II");
	}

	@Test
	public void dieDrei() {
		assertThat(
			R�mischenZiffern.f�rDie(3)
		).isEqualTo("III");
	}

	@Test
	public void dieVier() {
		assertThat(
			R�mischenZiffern.f�rDie(4)
		).isEqualTo("IV");
	}
}
