package com.poc.dependency.injection;

public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
