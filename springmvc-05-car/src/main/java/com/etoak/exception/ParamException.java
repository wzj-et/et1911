package com.etoak.exception;

/**
 * 自定义异常
 * 
 */
public class ParamException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ParamException(String message) {
		super(message);
	}

}
