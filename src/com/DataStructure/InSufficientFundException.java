package com.DataStructure;

public class InSufficientFundException extends Throwable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	 
	    public InSufficientFundException(String message) {
	        this.message = message;
	    }
	 
	    /*public InSufficientFundException(Throwable cause, String message) {
	        super(cause);
	        this.message = message;
	    }*/
	 
	    
		public String getMessage() {
	        return message;
	    }
}
