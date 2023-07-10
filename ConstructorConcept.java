package com.recollect.corejava;

/*
  constructor---
 it is a special method in which class name as constructor name
 there is no return type for constructor
 we can use private modifier for constructor then other class not able to access
 if we mention return type for constructor then java compiler considered as another method not constructor
 if we not write any constructor then compiler will create one default constructor
 default constructor: public and no arguments
 constructor overloading is possible -- eg; class name as A then constructor name as A()  or A(int i) or A(int i,int j)
 by passing different argument for same method then it is overloadinng 
 here we overload the constructor so constructor overloading
 public protected private  
 first statement inside the constructor always be super() or this()
 if we are not use super() or this() method then compiler by default placed super()

 super() method calling the default constructor of super class
 this() method calling the dafault comstructor of same  class 
 
 
 Recursive constructor calling is not allowed
 ------------------------------------
 class A{
  A(){
  
  this();
  }
 
 }
 ------------------------------------------
 no cyclic constructor calling 
 class A{
 
 A(){
 this(12);
 }
 A(int i)
 {
 this();
 }
 }
 
 */

class Demo{
	int i;
	{
		i=12;
		System.out.println("IIB  "+i);
		
	}
	Demo(){
		
		System.out.println("Default constructor");}
	Demo(int j)
	{
		this();
		i=j;
		System.out.println("Consturctor "+j);
		
	}
}

public class ConstructorConcept 
{
	public static void main(String...args)
	{
//		Demo d=new Demo(90);
//		System.out.println(d.i);
		
		
	}

}
