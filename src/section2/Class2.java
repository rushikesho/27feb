package section2;

public class Class2 { 
	int a =10 ;
	int b=10 ;
	String c;
 
	public static void main(String[] args) {
	Class1 obj = new Class1();
	System.out.println(obj.a + obj.b); 
	double k = obj.d+ 20;
	System.out.println(k);
	obj.c= "rushi";
	System.out.println(obj.c);
	Class2 obj1 =new Class2();
	int c = obj.a+obj1.b;
	System.out.println(c);
	obj1.c = "velocity classes";
	System.out.println(obj1.c);
	}

}
