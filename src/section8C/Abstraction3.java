package section8C;

public class Abstraction3 extends Abstraction2 { //concrete class
	
 public void test3() //declaration +body 
 {
	 
	 System.out.println("i am test3");//implementing the abstract class method
 }
     
	public static void main(String[] args) {
		Abstraction3  obj = new Abstraction3(); //default constructor 
		obj.rushi();
		obj.test();
		obj.test3();
		obj.test2();
		
		
	}

}
