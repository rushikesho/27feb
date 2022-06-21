package practise1;

import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int rev = 0;
		int orgNum = num;
		System.out.println("before reversing the no is " + num);

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reversed no  is  " + rev);

		if (rev == orgNum) {

			// checking palindrome no or not
			System.out.println("its palindrome no " + rev);
		} else {
			System.out.println("not a palindrome no " + rev);
		}
	}
}
