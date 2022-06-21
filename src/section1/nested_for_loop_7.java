package section1;

  public class nested_for_loop_7 {
      public static void main(String[] args) {
    	  for(int i=1;i<=5;i++) {  // i for rows stars
    		  
    		  for(int j = 4;j>=i;j--) { // j for spaces
    			  
    			  System.out.print(" ");
    			  
    		  }for(int k = 1; k<=i;k++) { // k for column star
    			  
    			  System.out.print("*");
    			  
    		  } System.out.println();
    	  }
	
     }
   }
