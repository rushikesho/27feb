package section8C;

 public class Abstraction2 extends Abstraction1{ //its not concrete class
	
	public void rushi()
	{
  System.out.println("rushi");
	}
	public void test2() {
  System.out.println("test2");
	}


	public static void main(String[] args) {
		Abstraction2 obj = new Abstraction2();
		obj.rushi();
		obj.test2();
		

	}

}
