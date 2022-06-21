package practiseArrays;

import java.util.Arrays;

public class FindDuplicateValueInArray { // duplicate value in array

	public static void main(String[] args) {

		String[] a = {"rushi" , "rathod" ,"rohit" ,"rohan" ,"ram" ,"keshav", "rohit" , "rathod" ,"ganesh" ,"vivek"} ;
		System.out.println("Before printing duplicate Array :" );

		int len = a.length ;
		boolean flag = false;

		for(int i = 0 ; i<len-1 ; i++) {

			for(int j = i+1 ; j<len-1 ; j++) {

				if(a[i]==a[j]) {
					System.out.println("found duplicate element  :" +a[i] ); 
					flag=true;

				}
			}	
		}
		if(flag==false) {
			System.out.println("duplicate element not found ");
		}
	}
}
