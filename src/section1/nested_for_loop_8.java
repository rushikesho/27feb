package section1;

public class nested_for_loop_8 {
	public static void main(String [] args) {
		for(int i = 1 ; i <= 5 ; i++) {  // i for rows 
			
			for(int j= 2 ;j<=i ;j++) {  //j for spaces in column 
				
				System.out.print(" ");
				
			}for(int k = 4 ; k>=i ; k--) { // k for column
				
				System.out.print("*");
				
			}System.out.println();
		}
	}

}
