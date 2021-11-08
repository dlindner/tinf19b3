package de.dhbw.tinf19b3.principles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Covariant {

	public static void main(String[] args) {
		final Integer[] fibonacci = new Integer[] {
		    1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
		};
		final Double pi = Double.valueOf(3.141592653589793238463D);

		//final Double[] moreNumbers = (Double[]) (Number[]) fibonacci;
		final Double[] moreNumbers = new Double[] { pi, pi };
		final Number[] numbers = fibonacci;
		final Number someNumber = pi;

		numbers[0] = (Number) pi;
		
		List<Object> myNumbers = new ArrayList<>();
		myNumbers.add(pi);
		Double reallyADouble = (Double) myNumbers.get(0);
		System.out.println(reallyADouble);
		
		Object[] myObjectsArray = new Object[] { new Object(), new Object() };
		myObjectsArray[0] = pi;
		System.out.println("--> " + myObjectsArray[0]);

		numbers[1] = someNumber;
		
		List<Integer> integers = Arrays.asList(fibonacci);
		List<Double> doubles = Arrays.asList(moreNumbers);
		
		List<? extends Number> listed = integers;
		listed = doubles;
		
		List<Number> obertyp = Arrays.asList(numbers);
		List<? super Integer> untertyp = obertyp;
		
		List<Object> myObjects = Arrays.asList(new Object(), new Object());
		untertyp = myObjects;
		
		// obertyp ist invariant
		//obertyp = myObjects;
		
		Predicate<Number> nurGerade = woist -> woist.intValue() % 2 == 0;
		
		List<Integer> collect = integers.stream()
										.filter(nurGerade)
										.collect(Collectors.toList());
	}
}
