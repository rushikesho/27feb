package section2;

public class ER {
	
	public void omkar() {
		int k = 7 ;
		System.out.println(k);
	}
	//5,10,7,7
	public static void test()
	{
		int a=10 ; 
		System.out.println(a); //
		ER obj =new ER();
		obj.omkar();
	}
	public  void rushi() {
		int b=5;
		System.out.println(b);
		test();//2 can directly call static method in non static method 
		omkar();//3 can call to non static method directly in non static method 
			
	}
	public static void main(String[] args) {
		//non static method madhe static call kayacha ahe 
		//ER.test();//we can call static method in class with class_name.static_method_name
	   // or
	  // test();//we can call directly to static method in class 
		ER obj = new ER();
		obj.rushi();
	}

}
