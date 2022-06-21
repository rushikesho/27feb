package section8;

public class Inheritance { // parent class 
	
	int a =10 ;
	static int b =110;
	{
	//	static int b = 10; // can't create static variable in instance block
		System.out.println(a);  //object create karav lagel  then this block execute 
	}
	
	static {
		//static block is executed first
	
		System.out.println("hi this is static block");
	}
	void A() {
		System.out.println("I am parent class method");
	}
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		System.out.println(Inheritance.b);
		obj.A();
		
	}	
         
}
