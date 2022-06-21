package practise1;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");

		int num = obj.nextInt();
		int n1 = num;
		int len = 0;

		while (n1 != 0) {
			n1 = n1 / 10;
			len = len + 1;
		}
		System.out.println("Lenngth of the no is " + len);
		System.out.println(n1);

		int n2 = num;
		int arm = 0;
		int rem;
		while (n2 != 0) {
			int mul = 1;
			rem = n2 % 10; // rem%10 = last digit
			
			for (int i = 1; i <= len; i++) {

				mul = mul * rem; // 1*2 = 2 ; 2*2 =; 4*2 = 8
			}
			arm = arm + mul;
			n2 = n2 / 10;
		}
		if (arm == num) {
			System.out.println("its an armstrong number");
		} else {
			System.out.println("not a armstrong number");
		}
	}
}
