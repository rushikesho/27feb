package section2;

public class Method3 {
 int a=10;
 static int b =50 ;
 
 public void test (int a,int b) {//parameterized non static method 
	 System.out.println(a+b);
 }
   public void rushi() { 
	   System.out.println("we can call directly non-static method in another non-static method");
	 
 }
 public void demo(String l) { // user defined non static method 
	 rushi();
	 System.out.println("hello");
	 String s = l;
	 System.out.println(s);
	 
 }
 public static void  rrr() {
	 System.out.println("this is static method we can call directly in non static as well as static method");	 
 }
 public void nonstatic() {
	 rrr();
	 rushi();
	 }
 public static void march() { // static keyword so its static method 
	 System.out.println(" i am static method");
	 rrr(); // static method call directly
 }
 public static void main(String [] args) {
	 Method3 obj = new Method3();
	obj.test(5, 6);
	obj.test(10, 20);
	obj.demo("hi");
	System.out.println(obj.a );
	System.out.println(b);//static member can access directly in class
	System.out.println(Method3.b);// for static elements we can call it by class name 
	Method3.march();// static methods called by class name 
	  // class_name.static_method_name
	obj.nonstatic();	
 }
}
