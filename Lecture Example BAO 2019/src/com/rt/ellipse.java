package com.rt;

public class ellipse {

	/**
	 * @param args
	 */
	
	
	public static void fun(int ...a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String... args) {
		// TODO Auto-generated method stub

	fun(1);
	fun(2,3);
	fun(1,2,3,4,5);
	}

}
