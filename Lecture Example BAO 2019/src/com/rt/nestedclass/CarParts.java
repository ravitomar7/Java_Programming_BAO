package com.rt.nestedclass;

public class CarParts {
	
	 int id=1;
	 static int factoryid=1234;
	 
	 
	 public void fun()
	 {
		 System.out.println("Hello from outer class");
	 }
	 
	 
	 public static void f()
	 {
		 System.out.println("I am static function");
	 }
	
	public CarParts() {
		System.out.println("CarPart Object Created");
	}
	
	public static class StaticNestedWheelClass
	{
		static int a=10;
		int id_wheel;
		
	void	fun2()
		{
			System.out.println("Hello");
			f();
		}
		public StaticNestedWheelClass() {
			System.out.println("Wheel Created from Factory"+factoryid);
//			System.out.println("Car Part Id"+id);   //   *****observe the error
		}
	}
	
	public class WheelInnerClass
	{
//		static int g=90;  //*********observe the error
		int b=20;
		public WheelInnerClass() {
		System.out.println("Wheel Created from Inner Class with FactoryId"+factoryid);
		System.out.println("Car Part Id"+id);
		}
	}
	

}
