package section8A;

public class ChildClass extends ParentClass {
	public void test() {
		System.out.println("I am overriden method ");
	}
	
	public static void test1() { //method hiding in static method
		System.out.println("i am static method and hidden method");
	}

//	void test2() 
//	//we have to increase the visibility of child class method more or equal to parent class method
//	{ //we can't use default method if parent method is public or protected
//		System.out.println("child class method ");
//	}
	
	
     public	String test3() { // return type must sub type of parent method or equal
		
    	 return null;
	}
  
	public static void main(String[] args) {
	ChildClass obj = new ChildClass();
	obj.test();
	//obj.test2();
	
	ChildClass.test1();
	}
}
