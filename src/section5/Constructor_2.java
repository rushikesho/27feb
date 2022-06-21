package section5;

public class Constructor_2 {
	
	 Constructor_2(){
		     // when we create object of the class then automatically constructor gets called 
             System.out.println("Hello I am constructor");
	}
	int a =10;
	String b=" velocity";
	public void test() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Constructor_2 obj = new Constructor_2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test();
		obj.test();
		obj.test();

	}

}

      //points to remember while creating the constructor 
      //constructor name must be same as class name 
     //A constructor must have no explicit return type 
     //A java constructor cannot be abstract , static ,final 
     // we can use access modifiers while creating the constructor

