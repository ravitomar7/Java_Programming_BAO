package com.rt.inheritence;

public class SamplePrivate {

	static int count=0;
	
	private SamplePrivate() {
		// TODO Auto-generated constructor stub
	}

	public static SamplePrivate fun1()
	{if(count<3)
	{  count++;
		System.out.println("Hello"+count+"Object creted");
		return new SamplePrivate();
	}
	else 
		{
		System.out.println("MAXIMIMUM LIMIT REACHED");
		return null;
		
		}
	}

	static SamplePrivate obj=new SamplePrivate();
	

}
