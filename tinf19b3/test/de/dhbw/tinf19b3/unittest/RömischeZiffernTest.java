package de.dhbw.tinf19b3.unittest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RömischeZiffernTest {

	@Test
	public void dieEins() {
		assertThat(
			RömischenZiffern.fürDie(1)
		).isEqualTo("I");
	}

	@Test
	public void dieZwei() {
		assertThat(
			RömischenZiffern.fürDie(2)
		).isEqualTo("II");
	}

	@Test
	public void dieDrei() {
		assertThat(
			RömischenZiffern.fürDie(3)
		).isEqualTo("III");
	}

	@Test
	public void dieVier() {
		assertThat(
			RömischenZiffern.fürDie(4)
		).isEqualTo("IV");
	}
}
