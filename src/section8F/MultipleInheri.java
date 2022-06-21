package section8F;

public class MultipleInheri extends ClassC implements Interface1, Interface2, Interface3 { // multiple inheritance through interfaces
	//its implementation class
	public void test() {
		System.out.println("implemented  test method of Interface1");
	}

	public void show() {
		System.out.println("implemented show method of Interface2");
	}

	public void test3() {
		System.out.println("implemented test3 method of Interface2");
	}

	public void display() {
		System.out.println("implemented display method of Interface3");
	}

	public static void main(String[] args) {
		MultipleInheri obj = new MultipleInheri();
		Interface3 on = new MultipleInheri();
		on.test();
		on.display();
		
		obj.test();
		obj.show();
		obj.test3();
		obj.display();
		System.out.println(a);
	
		obj.rushiRathod();        
		
	}

}
