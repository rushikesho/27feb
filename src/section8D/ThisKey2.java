package section8D;

public class ThisKey2 {
	// this keyword can be used to invoke current class method(implicitly)
	void test() {
		System.out.println("hello");
	}

	void test(int a) {
		System.out.println("hi hello");
	}

	void test1(Object a) {
		System.out.println("hi hello this is argument as this");
	}

	static void test(int b, int a) {
		System.out.println("static method");

	}

	void display() {
		this.test(10);// calls to parameterized method
		test();
		this.test();
		test1(this);
		test(1, 2);
		this.test(2, 1);
	}

	public static void main(String[] args) {
		ThisKey2 obj = new ThisKey2();
		obj.display();

	}

}
