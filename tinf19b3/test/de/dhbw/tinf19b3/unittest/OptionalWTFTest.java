package de.dhbw.tinf19b3.unittest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

public class OptionalWTFTest {

	@Test
	public void whatAboutOfNullable() {
		assertThat(
			Optional.ofNullable(null)
		).isEmpty();
		
		assertThat(
			Optional.ofNullable(Collections.emptyMap())
		).containsInstanceOf(Map.class);
		
		Map<String, String> dictionary = new HashMap<>();
		assertThat(
			Optional.ofNullable(dictionary)
		).contains(dictionary);
	}
}
