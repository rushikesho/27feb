package section4;
import section3.Access_modifiers;//in order to call a class outside the package we need to import 

public class Access_specifier {
 public static void main (String[] args) {
	 
	 Access_modifiers obj1 = new Access_modifiers();
	 
	 obj1.test();//public access modifiers 
	 System.out.println(obj1.a);
	 obj1.demo();//default access modifiers cannot be accessed outside the package
	 System.out.println(obj1.b);//default cannot be accessed outside the package
	 
 }
}
