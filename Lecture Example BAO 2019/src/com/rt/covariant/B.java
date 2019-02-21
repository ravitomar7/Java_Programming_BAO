

package com.rt.covariant;

public class B extends A {

	public int temp()
	{
		return 10;
	}
	
	
	@Override
	public A myfun(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("my implementation B"+a+" "+b);
		return new C();

	}

}
