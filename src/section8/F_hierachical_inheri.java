package section8;

public class F_hierachical_inheri extends E_hierachical_inheri{

	public void test() {
		super.rushi();
	System.out.println("hi this is hybrid inheritance");	
	}
	public static void rushi() {
	System.out.println("this is static method called as rushi");
	}

	public static void main(String[] args) {
		
		F_hierachical_inheri obj = new F_hierachical_inheri();
		obj.test();
		F_hierachical_inheri.rushi();
		
		obj.A();
		obj.D();
		

	}

}
