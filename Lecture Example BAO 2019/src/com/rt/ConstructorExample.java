package com.rt;

public class ConstructorExample {
	
	public void fun()
	{
		System.out.println("i am from function of class");
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello from sub class";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample obj=new ConstructorExample();
		Object oo=new Object();
	

		
		
		System.out.println(obj.toString());
		System.out.println(oo.toString());
		
		
		//obj.fun();
		
		

	}

}
