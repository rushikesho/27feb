package section3;

public class Test2 {
	

	public static void main(String[] args) {
		Access_modifiers_4 obj1 = new Access_modifiers_4();
		obj1.test(); // private elements cannot be called outside the class
        System.out.println(obj1.a);
	}

}
