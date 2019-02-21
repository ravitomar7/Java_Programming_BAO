
package com.rt.covariant;

public class A {
	
	int a,b;
	 
	
	public int temp()
	{
		return 0;
	}
	public A myfun(int a,int b){
		System.out.println("Original method"+a+" "+b);
		return new A();
		
	}
	

}
