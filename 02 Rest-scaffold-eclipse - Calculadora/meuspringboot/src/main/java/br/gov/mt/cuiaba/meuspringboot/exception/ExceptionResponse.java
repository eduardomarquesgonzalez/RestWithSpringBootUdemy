package br.gov.mt.cuiaba.meuspringboot.exception;

import java.io.Serializable;
import java.sql.Date;

public class ExceptionResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date timestamp;
	private String message;
	private String	details;

	public ExceptionResponse(Date date, String message, String details) {
		super();
		this.timestamp = date;
		this.message = message;
		this.details = details;
	}

	public ExceptionResponse(java.util.Date date, String message2, String description) {
		// TODO Auto-generated constructor stub
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
		
	}

