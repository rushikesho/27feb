package practise1;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		System.out.println("give the range number");

		Scanner obj = new Scanner(System.in);

		int a = 0, b = 1, c, d;

		d = obj.nextInt();

		System.out.print(a + "," + b);

		for (int i = 0; i < d; i++) {
			c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
		}

	}

}
