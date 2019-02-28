package com.rt.exceptionexamples;

public class CustomException extends RuntimeException {

	public CustomException(String msg) {
		
		super(msg);
	}
	
	public void resolve()
	{
		System.out.println("Exception Resolved");
	}
	
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "I am object of custom exception";
//	}
	
}
