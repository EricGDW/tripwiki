package com.itucity.tripwiki.common.exceptions;

public class TripwikiException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public TripwikiException(String message, Throwable cause) {
		super(message, cause);
	}

	public TripwikiException(String message) {
		super(message);
	}
}
