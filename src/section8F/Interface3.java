package section8F;

public interface Interface3 extends Interface2, Interface1  { // interface can extends multiple interfaces

	void display();

	static void display1() {
		System.out.println("static method display1 in Interface3");

	}

}
