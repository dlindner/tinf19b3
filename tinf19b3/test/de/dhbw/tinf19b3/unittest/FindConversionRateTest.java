package de.dhbw.tinf19b3.unittest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

public class FindConversionRateTest {

	@Test
	public void sonnenscheinfall() {
		// Arrange
		Map<String, String> kurse = new HashMap<>();
		kurse.put("USD", "75000000000000");
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("USD"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(kurse);
		
		// Assert
		assertThat(actual).contains(
				BigDecimal.valueOf(7.5E+13));
	}

	@Test
	public void sonnenscheinfall2() {
		// Arrange
		Map<String, String> kurse = new HashMap<>();
		kurse.put("AUD", "2.35");
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("AUD"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(kurse);
		
		// Assert
		assertThat(actual).contains(
				BigDecimal.valueOf(2.35D));
	}

	@Test
	public void nullKursFall() {
		// Arrange
		Map<String, String> nullKurse = new HashMap<>();
		nullKurse.put("CHF", null);
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("CHF"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(nullKurse);

		// Assert
		assertThat(actual).isEmpty();
	}

	@Test
	public void nullFall() {
		// Arrange
		Map<String, String> garKeineKurse = null; 
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("USD"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(garKeineKurse);
		
		// Assert
		assertThat(actual).isEmpty();
	}
	
	@Test
	public void leerFall() {
		// Arrange
		Map<String, String> keineKurse = Collections.emptyMap(); 
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("AUD"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(keineKurse);
		
		// Assert
		assertThat(actual).isEmpty();
	}
	
	@Test
	public void kursNichtVorhanden() {
		// Arrange
		Map<String, String> andereKurse = new HashMap<>();
		andereKurse.put("USD", "0.75");
		andereKurse.put("AUD", "75.0");
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("CHF"));
		
		// Act
		Optional<BigDecimal> actual = target.outOf(andereKurse);
		
		// Assert
		assertThat(actual).isEmpty();
	}
	
	@Test
	public void umrechungskursIstQuatsch() {
		// Arrange
		Map<String, String> andereKurse = new HashMap<>();
		andereKurse.put("AUD", "aus");
		FindConversionRate target = new FindConversionRate(
				Currency.getInstance("AUD"));
		
		// Act & Assert
		assertThatThrownBy(() -> target.outOf(andereKurse))
			.isInstanceOf(NumberFormatException.class);
	}
}
