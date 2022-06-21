package section8H;

public class ReturnType {
	void show() {
		System.out.println("hi this is return type tut");

	}

	int test(int b, int c) {
		System.out.println("hi this is returning the int");
		int a;
		a = b + c;
		return a;
	}

	static String rushi() {
		System.out.println("hi this is returning the string");
		return "hello";
	}

	public static void main(String[] args) {
		ReturnType obj = new ReturnType();

		System.out.println(obj.test(10, 20));
		System.out.println(rushi());
	}
}
