package practise1;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {

		System.out.println("enter the range");

		Scanner obj = new Scanner(System.in);
		
		int temp = 0;
		
		int num = obj.nextInt();
		
		for (int no = 2; no <= num; no++) {

			for (int i = 2; i < no; i++) {

				if (no % i == 0) {

					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.print(" " + no);
			} else {
				temp = 0;
			}
		
		}

	}

}
