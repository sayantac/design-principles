package com.poc.dependency.injection;

import java.io.IOException;

public class FormatException extends IOException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormatException(Exception cause) {
		super(cause);
	}
}
