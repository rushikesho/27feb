package section8D;

public class ThisKey {
	int i;
	int a = 10;

	void test(int i) {
		// i=i;
		this.i = i; // refers to instance variable
		int a = 20;
		System.out.println(a);
		System.out.println(i);
		System.out.println(this.a);
	}

	void rushi() {
		System.out.println(i);
	}

	static public void main(String[] args) {
		ThisKey obj = new ThisKey();

		obj.test(45);
		obj.rushi();
	}

}
