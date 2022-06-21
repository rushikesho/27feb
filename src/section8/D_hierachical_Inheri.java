package section8;
//also called hybrid inheritance 
//in this one is superclass and many sub classes(Child Class) directly inheriting the super class(Parent class)

public class D_hierachical_Inheri extends AsingleInheri {
	public void test() {
		
		//
		
		System.out.println(a); 
		
		System.out.println(s);
		
		System.out.println("this is hierachical inheritance having method test");
	}
	
	public static void  rushi() {
		D_hierachical_Inheri obj1 =new D_hierachical_Inheri();
		System.out.println(obj1.a);
		
		System.out.println(s);
		
		System.out.println("this is hierachical inheritance having method rushi");
	}

	public static void main(String[] args) {
		
		D_hierachical_Inheri obj = new D_hierachical_Inheri();
		
		obj.test();
		
		D_hierachical_Inheri.rushi();
		
		//parent class method calling
		obj.A();
		D_hierachical_Inheri.L();
		obj.D();
		D_hierachical_Inheri.K();
	
		
		
	

	}

}
