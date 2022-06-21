package section7;

import java.util.Arrays;

public class ArraysTraverse1 {

	public static void main(String[] args) {

		int[] a = { 11, 2, 40, 15, 45, 89 };
		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
            System.out.print(a[i]+" ");
           
		}
		System.out.println();
		 System.out.println(Arrays.toString(a));

	}

}
