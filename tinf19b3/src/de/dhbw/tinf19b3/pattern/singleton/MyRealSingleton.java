package de.dhbw.tinf19b3.pattern.singleton;

public enum MyRealSingleton implements Zufallsgenerator {

	TOBIAS("parameter"),
	;
	
	private String parameter;

	private MyRealSingleton(String parameter) {
		this.parameter = parameter;
	}
	
	@Override
	public int random() {
		return 4;
	}
	
	public void changeParameterTo(String newValue) {
		this.parameter = newValue;
	}
}
