package section2;

public class Method4 {
	public void show() {
	System.out.println("this is non static method of Method 4 class ");
		
	}
	public static void display() {
		System.out.println("this is static method of Method4 class");
	}

	public static void main(String[] args) {
		
		Method4 obj  =new  Method4();
		obj.show();
		Method4.display();
		
		Method3 obj1 = new Method3();
		obj1.rushi();//non-static method method3 class
		Method3.rrr();//static method of Method3 class
		
	}

}
