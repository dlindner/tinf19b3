package de.dhbw.tinf19b3.memorymodel;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Sparfuchs schwabe1 = new Sparfuchs();
		Sparfuchs schwabe2 = new Sparfuchs();
		
		Spardose gemeinsameDose = new Spardose();
		
		Runnable sparvorgang1 = () -> {
			for (int i = 0; i < 10_000; i++) {
				synchronized (schwabe1) {
					schwabe1.spare(gemeinsameDose);
				}
			}
		};
		Runnable sparvorgang2 = () -> {
			for (int i = 0; i < 10_000; i++) {
				synchronized (schwabe1) {
					schwabe2.spare(gemeinsameDose);
				}
			}
		};
		
		ExecutorService exec = Executors.newFixedThreadPool(100);
		exec.execute(() -> System.out.println("Hello world"));
		exec.shutdown();
		
		Stream.generate(Euro::new)
		      .limit(10_000)
		      .parallel()
		      .forEach(gemeinsameDose::einwerfen);
		
		
		Thread t1 = new Thread(sparvorgang1);
		Thread t2 = new Thread(sparvorgang2);
		t1.start();
		t2.start();
		// Warten auf Ende beider Threads
		t1.join();
		t2.join();
		
		System.out.println(gemeinsameDose);
	}
}
