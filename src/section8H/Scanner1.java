package section8H;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		System.out.println("using the scanner");
		Scanner obj = new Scanner(System.in);
		System.out.println("please enter the first number ");
		int a = obj.nextInt();
		Scanner obj1 = new Scanner(System.in);
		System.out.println("please enter the second number ");
		int b = obj1.nextInt();

		int c = a + b;
		System.out.println("sum is " + c);

	}

}
