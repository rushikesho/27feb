package practise1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("eneter the number");
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int fact = 1;
		for(int i = 1 ;i<= n;i++) {	

			fact = fact*i;	
		}
		System.out.println("factorial of " + n + " is " +fact);
	}
}
