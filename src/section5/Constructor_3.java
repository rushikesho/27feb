package section5;

public class Constructor_3 {
           Constructor_3(){ //zero argument constructor
        	   System.out.println("hi am constructor");
        	   
           }
           int a =10 ;
           String b ="Velocity";
           
           public void test() {
        	System.out.println("hi hello ");   
           }
           
	public static void main(String[] args) {
		Constructor_3 obj = new Constructor_3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test();
		obj.test();
		obj.test();

	}

}
