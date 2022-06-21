package section4;
import section3.Access_modifiers_3;
 
public class Access_specifier_3 extends Access_modifiers_3 { // with the help of inheritance we access protected members 
	public static void main(String[] args) {
		Access_specifier_3 obj =new Access_specifier_3();//object of current class
		obj.test();//protected elements cannot be called directly outside the package
		System.out.println(obj.a);

	}

}
