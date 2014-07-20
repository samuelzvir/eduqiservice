package org.eduqi.eduqiservice.core.exception;

public class TypeaheadStartException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public TypeaheadStartException(String message) {
        super(message);
    }

	public TypeaheadStartException(String message, Throwable cause) {
        super(message, cause);
    }
}
