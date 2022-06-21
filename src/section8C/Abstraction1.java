package section8C;

public abstract  class  Abstraction1 { // abstract class
	public void test() {
		System.out.println("hi this is rushikesh ");
	}
	public abstract void  rushi(); //its only declared no body (unimplemented method)
	
	
	public abstract void test2(); //only when abstract method with abstract keyword 

	
	public abstract void test3();
   
	public  static void rohan()
	{
		System.out.println("hi this is static method");
	}
	
	final void  rohit() { // final method declaration
	System.out.println("hi this is final method");	
	}
    
	Abstraction1() //constructor declaration 
	{
		System.out.println("hi this is constructor");
	}
	
}
