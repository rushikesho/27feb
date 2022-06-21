package section3;

public class Access_modifiers_4 {
	private int a=10;
	
	private void test() {
		System.out.println("I am private ");
	}
 
	public static void main(String[] args) {
		Access_modifiers_4 obj =new Access_modifiers_4();
		System.out.println(obj.a);
		obj.test();//private member only called and accessed in class 
		
       	 

	}

}
