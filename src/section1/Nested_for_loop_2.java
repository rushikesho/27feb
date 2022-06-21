package section1;

public class Nested_for_loop_2 {

	public static void main(String[] args) {
		//full triangle pattern 
		
				for(int i=1; i<=5 ;i++) { // i for row stars
					
					for(int j=5;j>=i;j--) { // j for column stars
						System.out.print(" * ");
					}
					System.out.println();
				}
			
                 for(int i=1; i<=5 ;i++) { // i  for row stars
					
					for(int j=1;j<=i;j++) { // j for column stars
						System.out.print(" * ");
					}
					System.out.println();
				}
                 
	}

}
