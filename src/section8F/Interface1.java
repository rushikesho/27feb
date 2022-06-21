package section8F;

public interface Interface1 {
	int a = 20; // by default final ,static ,public

	void test(); // by default public ,abstract

	static void test1() { // can create the complete method of static method
		System.out.println("static method test1  ");
	}

	static void main(String[] args) { // public by default
		// Interface1 obj = new Interface1(); // can't create object of interface
		System.out.println(a);
		test1();
	}

}
