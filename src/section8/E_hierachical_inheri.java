package section8;

public class E_hierachical_inheri extends AsingleInheri {
	
	public void A() {
		super.A();
     System.out.println("hi this is child of AsingleInheri");		
	}
	public static void rushi() {
		System.out.println("hi  hello this is rushi method ");
	}
     
	public static void main(String[] args) {
		E_hierachical_inheri obj = new E_hierachical_inheri();
		
		obj.A();
		E_hierachical_inheri.rushi();
		 	//or
	        rushi();
	         
		//calling to parent class  methods    
		E_hierachical_inheri.L();
		obj.D();
		E_hierachical_inheri.K();
		
	
		
		
		
	}

}
