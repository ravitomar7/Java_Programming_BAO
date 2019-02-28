package com.rt.exceptionexamples;

class Exception8 {
static void throwOne() throws IllegalAccessException {
System.out.println("Inside throwOne.");
throw new IllegalAccessException("demo1 ");
//throw new ArithmeticException();
}
public static void main(String args[]) {
try {
	throwOne();
} catch (IllegalAccessException e) {
	// TODO Auto-generated catch block
	e.getMessage();
	System.out.println(e.toString());
//	e.printStackTrace();
}
}
}