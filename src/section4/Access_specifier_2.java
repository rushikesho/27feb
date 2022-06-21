 package section4;
  import section3.Access_modifiers_2;//in order to call a class outside the package we need to import
     public class Access_specifier_2 {

	   public static void main(String[] args) {
		Access_modifiers_2 obj = new Access_modifiers_2();
		 obj.test();//public access modifiers 
		 System.out.println(obj.a);
		// obj.demo();//default access modifiers cannot be accessed outside the package
		// System.out.println(obj.b);//default cannot be accessed outside the package

	}

}
