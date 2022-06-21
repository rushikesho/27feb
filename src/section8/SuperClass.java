package section8;

public class SuperClass { // super class or parent class
	int a ; //super class global variable
	static int b ;//static variable 
	SuperClass(){//constructor of super class
		System.out.println("this is super class constructor");
	}
	
	SuperClass(int b){ //parameterized constructor 
		System.out.println(b);
		
	}
	
	public void rushi() { // super class method or parent class method
		System.out.println("hi this is super class");
	}
	public void rushi(int a) { // parameterized super class method
		System.out.println("hi this is parameterized super class  method having parameter a");
		System.out.println(a);
		
	}
	public void test() {
		System.out.println("this is test super class method and name is test");
		
	}
	
		
	
	public static void test2() { // static super or parent class method 
		System.out.println("non static super class method ");
	}
}
