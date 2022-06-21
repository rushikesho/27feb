package section8D;

public class ThisKey3 {
	ThisKey3() {
		this(20);// calls to parameterized constructor

		System.out.println("hi this is zero argument constructor");

	}

	ThisKey3(int a) {
		// this(); //calls to zero argument constructor
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		ThisKey3 obj = new ThisKey3();
		ThisKey3 obj1 = new ThisKey3(10);
	}

}
