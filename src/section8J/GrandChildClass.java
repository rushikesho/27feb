package section8J;

public class GrandChildClass {

	
	void rushi() {
		System.out.println("hi this is grand child class");
	}
	public static void main(String[] args) {
		ParentClass obj1 = new ChildClass();
		obj1.test();
		obj1.test1();

	}

}
