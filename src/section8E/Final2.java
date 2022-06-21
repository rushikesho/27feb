package section8E;

public class Final2 extends Final1 {
	void test() {
		System.out.println("hi this is overriden method");
	}

	void test1() { // can't override final method
		System.out.println("can't override final method");

	}

	static void test2() {
		System.out.println("can't override static and final method");
	}

	public static void main(String[] args) {

	}

}
