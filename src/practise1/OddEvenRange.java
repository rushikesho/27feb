package practise1;

public class OddEvenRange {

	public static void main(String[] args) {

		int sum_even = 0;
		int sum_odd = 0;
		int n = 1450;
		int even_count = 0;
		int odd_count = 0;

		for (int i = 1300; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(" even no " + i);
				sum_even = sum_even + i;
				even_count++;
			} else {
				System.out.println(" odd  no " + i);
				sum_odd = sum_odd + i;
				odd_count++;
			}
		}
		System.out.println("\nTotal even count is " +even_count);
		System.out.println("Total odd  count is " +odd_count);
		System.out.println("\nsum of all even no is " + sum_even);
		System.out.println("sum of all odd  no is " + sum_odd);
	}
}
