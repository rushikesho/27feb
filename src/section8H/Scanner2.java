package section8H;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		System.out.println("enter your name");
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		System.out.println("Your name is " + name);

	}

}
