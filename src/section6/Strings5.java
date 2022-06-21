package section6;
//interview question
public class Strings5 {

	public static void main(String[] args) {
//		palindrome Strings or not
		String s = "Mom";
		int len = s.length();
		String org_string = s;
		String rev = "";
		System.out.println("before reversing the string is " + s);
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("after reversing the string is " + rev);

		if (org_string.equalsIgnoreCase(rev)) {
			System.out.println("its palindrome word");

		} else {
			System.out.println("not a palindrome word");
		}

	}

}
