

package com.rt.covariant;

public class C extends B {



	@Override
	public C myfun(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("my implementation C"+a+" "+b);
		return new C();
	}

}
