package section5;

public class Constructor_1 {
	int a = 10 ;
	String b ="velocity" ;
	
	int c ;
	Boolean d ;
	double h;
    
	public void test() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Constructor_1 obj = new Constructor_1();//default constructor
	System.out.println(obj.a);
	System.out.println(obj.b);
	
	System.out.println(obj.c);
	System.out.println(obj.d);
	System.out.println(obj.h);
	
	obj.test();
	obj.test();
	}

}
 