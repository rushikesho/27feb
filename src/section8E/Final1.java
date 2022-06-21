package section8E;

public class Final1 {

	final int a = 10;
	int b = 20;
	final static int c = 34;

	void test() {
		System.out.println("test method in parent class");
	}

	final void test1() {
		System.out.println("final test1 method in parent class");
	}

	final static void test2() {
		System.out.println("static and final method test2 in parent class");
	}

	public static void main(String[] args) {

		Final1 obj = new Final1();
		// obj.a=13; // can't change value of final variable
		obj.b = 12;
		// System.out.println(Final1.c=13);//can't change the value static final
		// variable

		System.out.println(obj.b = 12);
	}

}
