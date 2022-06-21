package section8J;

public class TypeCasting {

	public static void main(String[] args) {

//	byte -> short-> int -> double
		
		int a = 10;
		double d = a;
		System.out.println("type casting implicit and no data loss " + d);
		int b = 20;
		float f = b;
		long l = b;
		float w = l;
		System.out.println("long to float " +w);
		System.out.println("integer to long " + l);
		System.out.println("integrer to float " + f);
		char c = 'a';
		int j = c;
		System.out.println("character to interger " + j);

		System.out.println("explicit typecasting data loss ");

		double s = 20.40;
		int i = (int) s;
		System.out.println(i);
		
		
	}

}
