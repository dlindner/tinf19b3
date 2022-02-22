package de.dhbw.tinf19b3.unittest;

import org.junit.Test;
import org.mockito.Mockito;

public class MockbasierterTest {

	@Test
	public void mocksKennenlernen() {
		Mehrwertsteuer lichtdouble = Mockito.mock(Mehrwertsteuer.class);
		Mockito.when(lichtdouble.fürLebensmittel(100.0D)).thenReturn(300.0D);
		//Mockito.replay();
		
		double lichtactual = lichtdouble.fürLebensmittel(100.0D);
		lichtactual = lichtdouble.fürLebensmittel(100.0D);
		System.out.println(lichtactual);
		System.out.println(lichtdouble.fürLebensmittel(99.0D));
		
		System.out.println("------------");
		
		Mehrwertsteuer steuer = new Mehrwertsteuer();
		double actual = steuer.fürLebensmittel(100.0D);
		System.out.println(actual);
		
		Mockito.verify(lichtdouble, Mockito.times(2)).fürLebensmittel(100.0D);
		Mockito.verify(lichtdouble).fürLebensmittel(99.0D);
	}
}
