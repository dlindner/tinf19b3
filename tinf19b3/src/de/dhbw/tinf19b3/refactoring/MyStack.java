package de.dhbw.tinf19b3.refactoring;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class MyStack<T> {
	
	private final List<T> myList;
	
	public MyStack() {
		super();
		this.myList = new LinkedList<>();
	}
	
	public void push(T newItem) {
		this.myList.add(0, newItem);
	}
	
	public final T pop() {
		return this.myList.remove(0);
	}
	
	public int getSize() {
		return this.myList.size();
	}
	
	public boolean isEmpty() {
		//return this.myList.isEmpty();
		return (getSize() == 0);
	}
	
	public void reset() {
		this.myList.clear();
	}
}
