package section3;

public class Test1 {

	public static void main(String[] args) {
		Access_modifiers_3 obj =new Access_modifiers_3();
		obj.test(); // protected can be called within the same package 
		System.out.println(obj.a);

	}

}
