package section8D;

public class ThisKey4 {
	ThisKey4 m1() { 
		System.out.println("hi hello we are returning this ");
		return this;
	}

	public static void main(String[] args) {
		ThisKey4 obj = new ThisKey4();
		obj.m1();

	}

}
