package section8;

public class Cmultilevel_inheri extends BsingleInheri {
	void Test() {
		super.A();
		super.D();
		System.out.println("this is multilevel inheritance having Test() mrthod");
	}
   public void A() {
	  
	   System.out.println("this is multilevel inheritance having A() method");
    	
    }
   void D() {
	   System.out.println("this is multilevel inheritance having D() method");
   }
	public static void main(String[] args) {
		
		Cmultilevel_inheri obj = new Cmultilevel_inheri();
		obj.Test();
		obj.A();
		obj.D();
		
		
	}

}
