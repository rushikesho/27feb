package section3;

public class Test {

	public static void main(String[] args) {
		Access_modifiers obj = new Access_modifiers();
		obj.test();
		
		obj.demo();//default can be accessed inside the package
		System.out.println(obj.b);//default can be accessed inside the package
		
        System.out.println(obj.a);
        
	}

}
