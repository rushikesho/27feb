package section8J;

public class ChildClass extends ParentClass {
	int a = 10;
	static int b = 50;

	ChildClass() {
		System.out.println("I am child class constructor");
	}

	void show() {
		System.out.println("hi this is child class property ");

	}

	public static void rushi() {
		System.out.println("child class static method");

	}

	public static void rohan() {
		System.out.println("static method child class rohan");
	}

	public void test1() {
		System.out.println("this is child class test1 (overrided)");
	}

	public static void main(String[] args) {
		ParentClass obj = new ChildClass();// child class object and its up casting
		// that is referring to the parent class non static method and member(global
		// instance variables)
		// object of child and constructor of child
		obj.test();
		obj.test1(); // will show only updated implementation as up casting is done

		// obj.show();// it will not call to those which is not overridden method
		// to call the child class method we use down casting
		obj.rushi();
		((ChildClass) obj).show();// down casting calling the child class methods
		System.out.println(obj.a);// parent class variable
		System.out.println(((ChildClass) obj).a); // child class variable
		
  
	}

}
