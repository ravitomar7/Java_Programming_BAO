
package com.rt.covariant;

public class ABCmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		
		System.out.println(	ob1.myfun(2, 3));
		System.out.println(ob2.myfun(2, 3));
		System.out.println(ob3.myfun(2, 3));

	}

}
