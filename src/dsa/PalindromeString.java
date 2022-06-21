package dsa;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		//			palindrome Strings or not
		
		System.out.println("Enter the string");
		Scanner obj = new Scanner(System.in);

		String s = obj.next();
		int len = s.length();
		String org_string = s;
		String rev = "";
		System.out.println("before reversing the string is " + s);
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("after reversing the string is " + rev);

		if (org_string.equalsIgnoreCase(rev)) {
			System.out.println("Its palindrome word");

		} else {
			System.out.println("It is not a palindrome word");
		}
	}

}
