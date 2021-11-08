package de.dhbw.tinf19b3.principles.isp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Bauernhof {

	public static void main(String[] args) {
		Ackergaul paul = new Ackergaul();
		paul.arbeite();
		
		Lebewesen paul2 = paul;
		paul2.esse();
		
		Iterable<Arbeitstier> belegschaft = new ArrayList<>();
		for (Arbeitstier arbeitstier : belegschaft) {
			
		}
		Stream<Arbeitstier> streamed = new ArrayList().stream();
	}
}
