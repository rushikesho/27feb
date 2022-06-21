package practise1;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int count = 0;
		
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num + " is Prime No");

			} else {
				System.out.println(num + " is not a Prime No");
			}

		} else {
			System.out.println(num + " is not Prime number");
		}
	}
}
