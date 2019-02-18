package com.rt.nestedclass;

interface xyz
{
	public void fun1();
}

public class TestClass  {


	public static void main(String[] args) {

//Call f from CarPart
		//Create Obj of Car part
		//print factoryId
		//call fun 2 ?? change id_wheel ??
		//create obj of StaticNestedWheelClass
		//create obj of WheelInnerClass
		
		
		
		
		
		
		
		
		
		
		CarParts.f();




		//NOrmal Class instantiate
		CarParts ob1=new CarParts();
		//	    	 
		//	    
		System.out.println(CarParts.factoryid); 
		//	        
		//	        //**************STATIC CLASS*********
		////	      
		CarParts.StaticNestedWheelClass ob2=new CarParts.StaticNestedWheelClass();
		ob2.fun2();
		ob2.id_wheel=20;
		CarParts.StaticNestedWheelClass.a=20;
		//	
		//	        
		////	       ************ INEER CLASS*******************
		//	        
		//	      CarParts.WheelInnerClass ob3=new CarParts.WheelInnerClass();  //observe the error
		//	    
		CarParts.WheelInnerClass ob4=ob1.new WheelInnerClass();
		//	    	



	}





}

