package com.capgemini.greatoutdoors.exception;

public class RetailerException extends Exception {

	String log;

	public RetailerException(String log) {
		super(log);	
	}

}
