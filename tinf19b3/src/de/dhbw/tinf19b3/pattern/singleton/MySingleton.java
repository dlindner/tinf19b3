package de.dhbw.tinf19b3.pattern.singleton;

public final class MySingleton {

	//private static final Object semaphore = new Object();
	// EAGER -ASAP
	private static MySingleton instance = new MySingleton();
	
	private MySingleton() {
		super();
	}
	
	public static MySingleton getInstance() {
		return instance;
		// LAZY - ALAP
//		synchronized (semaphore) {
//			if (null == instance) {
//				instance = new MySingleton();
//			}
//			return instance;
//		}
	}
	
	public int random() {
		return 4;
	}
}
