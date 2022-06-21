package section8;

public class BsingleInheri extends AsingleInheri { //single inheritance child class
	
	int a =35;
	static String s = " Velocity";
	
	public void W() {
		
		super.D();
		super.K();
		
		System.out.println(super.a);
		System.out.println(super.s);
		
		System.out.println("hi this is child method non static name is W()");
	}
	
   static void R() {
	 
	System.out.println("this is child method static name is R()");
}
 
   void D() { //@override method
	   
	 System.out.println("this is non static child method called D()");
 }
    public static void K() {
    	
	 //super.k();//not use super keyword  in static method 
	
	 System.out.println("hi this is a static child method K()");
 }
	public static void main(String[] args) {
		BsingleInheri obj = new BsingleInheri();
		
		System.out.println(obj.a);
		System.out.println(s);
		
		//child methods
		obj.W();
		BsingleInheri.R();
		obj.D();
		BsingleInheri.K(); //only call to child class method
		
		//parent methods 
		obj.A();
		BsingleInheri.L();
		
		
				

	}

}
