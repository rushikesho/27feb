package section8E;

public class Final4 extends Final3 { // can't inherit final class
	
	void show() {
		System.out.println("can't inherit final class Final3");
	}

	public static void main(String[] args) {
		Final4 obj = new Final4();
		obj.show();

	}

}
