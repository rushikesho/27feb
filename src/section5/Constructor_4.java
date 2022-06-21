package section5;

public class Constructor_4 {
	
Constructor_4(String name){ // parameterized constructor
		
		System.out.println(name);
	}

   int a=10 ;
    String b = "velocity";
    public void test() {
    	System.out.println("hi hello");
    }

	public static void main(String[] args) {
		Constructor_4 obj = new Constructor_4("hi this parameterized constructor");
	  System.out.println(obj.a);
	  System.out.println(obj.b);
	  obj.test();
	  obj.test();
	  obj.test();
	  
 Constructor_5 obj2 = new Constructor_5(); //we have called constructor_5 in other class having same package
	  
	}

}
