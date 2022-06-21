package section8A;

public class PolymsmMethodOverload {
	void show() {
		System.out.println("Zero Argument");
	}
	void show(String c) {
		System.out.println("this is method overloading");
	}

	void show(int a) { // type promotion
    System.out.println(a);
		System.out.println("int argument ");
	}

	public static void main(int a, int b) { // main method overloading
		System.out.println("hi this is main method overloading");

	}

	public static void main(String[] args) {

		PolymsmMethodOverload obj = new PolymsmMethodOverload();
		obj.show();
		obj.show('c');  // automatic promotion (char to int )
		obj.show("hi"); //string parameter

		PolymsmMethodOverload.main(1, 2);

	}

}
