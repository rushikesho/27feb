package section2;

public class Class3 {
	int a =20 ;
	int b=10;
	String s="1234456";
	
	public static void main(String[] args) {
		Class1 obj =new Class1();
		System.out.println(obj.a +" "+ obj.b +" "+ obj.c +" "+ obj.d);
       Class2 obj1 =new Class2();
  int c =    obj1.a + obj1.b ;
  String d =obj1.c;//calling
  System.out.println(c + "\n" +  d+ " \n ");
  Class3 obj2 = new Class3();
  int i= obj2.a - obj.b;
System.out.print("String is also number " +obj2.s+ "\n " + i);


	}

}
