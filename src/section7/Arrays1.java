package section7;

public class Arrays1 {
	void show() {
//		ways to declare array
		int[] b = { 4, 5, 6, 7 };// decl-1 and initialization

		int c[] = { 7, 87, 8, 5 };// declaration -2 and initialization

		int[] a = new int[] { 1, 2, 3 };// declaration - 3 and initialization

		int[] p = new int[10];

		p[0] = 0;
		p[1] = 9;
	}

	public static void main(String[] args) {

		String[] d = { "Suyog", "Aditya", "Omkar", "Harshad" };
		String name = d[0];
		int len = name.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
			rev = rev + name.charAt(i);
		}
		System.out.println("\nreverse string is " + rev);
	}

}
