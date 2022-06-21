package section2;

public class Static_nonstatic {
	
	int a =12 ; // global variable + (non static variable  + instance variable) 
	static int b =20 ; //global variable  (static variable  + class variable )
	 static String c = "1234";
	  
	public void nonstatic() { 
		// non static method need to create object of class
		System.out.println("hi this is non static method");
	   int n =45 ; // local variable
   //static int j =20;
//can't create static variable as local variable in method(non static method as well as static method )
	  System.out.println(n);
	System.out.print(a); // directly call to non static variable in non static method
	}
	
   public static void rushi() {
	 //static method do not not need to create object of class it can directly call with class name
		Static_nonstatic obj1 =new Static_nonstatic();
		System.out.println(obj1.a);//can't call directly to non static variable in static method  
		int d =40 ; // local variable 
	//	static int g =6 ; //we can't create static variable( class variable ) as local variable     
		System.out.println(" hi  this static method ");
       	System.out.println(d);
	}
	public static void main(String [] args ) {
		
		Static_nonstatic.rushi();
		Static_nonstatic obj = new Static_nonstatic();
		obj.nonstatic(); //calling to non static method
	}
}
