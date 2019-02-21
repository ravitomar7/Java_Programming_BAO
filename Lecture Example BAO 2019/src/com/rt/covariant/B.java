

package com.rt.covariant;

public class B extends A {

	@Override
	public C myfun(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("my implementation B"+a+" "+b);
		return new C();

	}

}
