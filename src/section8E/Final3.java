package section8E;

public final class Final3 {
	void rushi() {
		System.out.println("hi this final class");
	}

	final void show() {
		System.out.println("we can't inherit the final class");
	}

	public static void main(String[] args) {

		Final3 obj = new Final3();
		obj.rushi();
		obj.show();
	}

}
