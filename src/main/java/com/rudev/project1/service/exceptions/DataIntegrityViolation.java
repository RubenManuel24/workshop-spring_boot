package com.rudev.project1.service.exceptions;

public class DataIntegrityViolation extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DataIntegrityViolation(String msg) {
		super(msg);
	}

}
