package com.rt.interfaces;

public class Test implements i1,i2,markex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj=new Test();
		obj.f1();
		
		i1 obj2=obj;
		obj2.f2();
		
		i3 obj3=new i3() {

			@Override
			public void f5() {
				// TODO Auto-generated method stub
				System.out.println("From f5");	
			}
		};
		obj3.f5();
		
		
		System.out.println(obj instanceof markex);
		
		
		
		
		
		

	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("From f1");
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
		System.out.println("From f2");
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("From f3");
		
	}

}
