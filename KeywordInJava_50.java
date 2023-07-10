package com.recollect.corejava;

import java.util.Scanner;

/*
 * ----------------------------------abstract keyword-----------------------
 * abstract--->  if the method contains no body or no implementation then we mention that method as abstract
 * if the class contain one abstract method then we have to compulsory make that class as abstract
 * then only we are not able to create an object 
 * whatever class extends that abstract compulsory should give the implementation ..otherwise we will get Compile time 
 * error.we can mention abstract class if we don't want to create an object
 * but its compulsory when our class contains one abstract we should mention that class as abstract
 * we can't use abstract keyword with variables and constructors
 * 
 * Abstraction in java is implemented using abstract classes and interfaces
 * we can't create object for abstract classes but we can create object to sub classes of abstract class
 * abstract class can be a combination of  both concrete and abstract methods
 * 
 * inside abstract class we can keep any number of constructors..if we not keeping any constructors then compiler will generate the default connstructor
 * 
 * abstract method cannot be private
 * bcoz we have to implement that abstract methods in the sub classes
 *abstract method cannot be static
 *constructors and fields cannot be declared as abstract  
 * 
 * 
 * static abstract void method1() {}----> it is not allowed
 * private abstract void method2(){}---> it is not allowed
 * abstract int num;---- variables or field cannot be abstract
 * abstract DemoClass(){}----abstract constructor is not allowed
 * 
 * -------------------------------------assert keyword -----------------------------------
 * 
 * assert keyword used in assertion statement
 * test ur assumptions about a program
 * assertion statements are the best way to detect and correct the programming errors
 * -------------boolean-----------------
 * it hold only two values either true or false
 * --------------break-------------------
 * to stop the execution of a loop based on some condition
 * --------------------byte -------------------
 * byte is a keyword used to declare byte type of variables  it is in the range of -127 to 128
 * -----------switch case--------------------
 * both switch and case keyword used in switch-case statement
 * -----------------try catch finally-----------------------
 * these three keywords are to handle teh exception in java
 * try block---- the statement which thrown (Runtime exceptions)some exception
 * catch block----will caught that exception which is thrown by try block
 * it takes one argument of type java.lang.Exception
 * finally block--- which is used to close the resources or else if we want some statement will execute if exception thrown or not
 * ------------------class and char --------------
 * char used to declare primitive char type variable
 * class used to define classes
 * ------continue-------------
 * stop the execution of current iteration and continue to the next iteration
 * -----------default-----------
 * default is a keyword which is used to define the default method in interface from java 8 and 
 * also default keyword used in switch-case no matches are there then default case will be get a chance
 * to execute
 * -----------enum --------------
 * enum MyEnum{ A,B,C,D}
 * ---------------extends-------------
 * used in inheritance,used to extends another class
 * --------------------final----------------
 * final is a keyword applicable for variable method class 
 * if we mention any class as final then we can't extend that final class 
 * if we mention any variable as final then we can't change the value again
 * if we mention any method as final then we can't override that method again
 * 
 * Any class or method can be abstract or final but not both
 * 
 * abstract final oppossite
 * 
 * when an array reference variable declared as final only variable itself final not the array elements
 * final int[] array=new int[10];
 * x[2]=90;
 * x[2]=56;
 * array element can be re-assigned
 * can't re-assign new array object to final array variable 
 * 
 *static ,local,non-static or instance --- all can be final 
 * 
 * final static int i=10;---final static variables
 * final int j=13;----final non static variables
 * 
 * global variable -- not initialized explicitly it will initialize at the time of object creation
 * final non static variable  --- initialized at the time of declaration,constructor ,any one of instance block
 *final static variable  --initialized at the time of declaration or in static initialization  block 
 * 
 *----------static field-----------------
 *static field are loaded into memory only once in the whole exectution
 *static field are common to all objects
 *when they are declared as final they get the value only once and the value remains
 *constant for the whole execution .
 * ---------------instanceOf-------------------
 * to check whether an object is of specified type 
 * Syntax---- objectReference instanceOf type
 * class A{
 * }
 * public class MainClass
 * {
 * public static void main(String...args)
 * {
 * A a=new A();
 * if(a instanceOf A)
 * {
 * System.out.println("a is of type A");
 * }
 * }
 * }
 * --------------------------------------------------------------
 *static ---define the class level members of a class
 *static members of a class stored in the class memory
 * 
 * 
 * static variable static method static class(inner or nested class)-- applicable
 *SIB used to initialize only static variable it is a block wihtout name enclosed within {}
 * IIB used to initialize non static variable it is block without name enclosed within {} 
 */

class A{
	
}
class B{
	
}
public class KeywordInJava_50
{

	public static void main(String...args)
	{
		B b=new B();
		if(b instanceof B)
		{
			System.out.println("a is of type A");
			
		}
		
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter the marks: "); int mark=input.nextInt(); assert
		  mark>35 :"fail";
	}
}
