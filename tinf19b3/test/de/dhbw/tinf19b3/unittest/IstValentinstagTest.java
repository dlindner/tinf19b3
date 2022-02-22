package de.dhbw.tinf19b3.unittest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

public class IstValentinstagTest {

	@Test
	public void fürMitteFebruar() {
		// Arrange
		LocalDate mitteFebruar = LocalDate.of(2022, 2, 15);
		
		// Act
		boolean actual = IstValentinstag.am(mitteFebruar);
		
		// Assert
		assertFalse(actual);
		assertThat(actual, is(false));
		assertThat(actual).isFalse();
	}

	@Test
	public void fürWeihnachten() {
		// Arrange
		LocalDate weihnachten = LocalDate.of(2022, 12, 25);
		
		// Act
		boolean actual = IstValentinstag.am(weihnachten);
		
		// Assert
		assertThat(actual).isFalse();
	}

	@Test
	public void für14tenFebruar() {
		// Arrange
		LocalDate valentinstag = LocalDate.of(2022, 2, 14);
		
		// Act
		boolean actual = IstValentinstag.am(valentinstag);
		
		// Assert
		assertThat(actual).isTrue();
	}
	
	@Test
	public void für14tenMärz() {
		// Arrange
		LocalDate irgendeinGeburtstag = LocalDate.of(2022, 3, 14);
		
		// Act
		boolean actual = IstValentinstag.am(irgendeinGeburtstag);
		
		// Assert
		assertThat(actual).isFalse();
	}
}
