package practiseArrays;

import java.util.Arrays;

public class SortingOfArrayMergeSort {

	public static void main(String[] args) {

		int[] a = { 4 ,2 ,8,3,4,6, }; 
		System.out.println("Ascending order Sorting ");

		System.out.println("Before sorting Array is  : " + Arrays.toString(a)); 

		int len = a.length ;

		int temp ;

		for(int i = 0 ; i< len-1 ; i++  ) { // no of passes (length -1)

			for(int j= 0 ;j<len-1 ;j++) { //  no of iterations of that passes

				if(a[j]>a[j+1]) {

					temp   = a[j] ;
					a[j] = a[j+1] ;
					a[j+1]   = temp;
				}

			}
		}
		System.out.println("After  sorting Array is  : " + Arrays.toString(a));
	}

}
