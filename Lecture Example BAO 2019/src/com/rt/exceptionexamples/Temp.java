package com.rt.exceptionexamples;

public class Temp extends Exception{

	public Temp(String s) {
		// TODO Auto-generated constructor stub
	super(s);
	}

}


class TestCustomException1{  
	  
	   static void validate(int age){  
	     if(age<18)  
	      throw new Temp("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  
