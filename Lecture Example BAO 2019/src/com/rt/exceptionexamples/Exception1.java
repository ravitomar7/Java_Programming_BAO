package com.rt.exceptionexamples;

import java.io.IOException;

class Exception1 {
public static void main(String args[])  {
int d = 1;
int a = 42 / d;

CustomException eobj=new  CustomException("My own Exception");
System.out.println(eobj);
throw eobj;


//
//try {
//	
//	throw eobj;
//} catch (CustomException e) {
//	// TODO Auto-generated catch block
//	
//	e.resolve();
//	System.out.println("Resolved succesfully");
////	e.printStackTrace();
//}



//
//try {
//	throw new IOException();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
}
}