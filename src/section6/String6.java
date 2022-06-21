package section6;

public class String6 {

	public static void main(String[] args) {
 String s = "velocity katraj pune";
 //s= s.trim();
 int len = s.length();
  int count = 0 ;
  int count1 =0 ;
  for(int i =0 ; i<len ;i++) {
	  if(s.charAt(i)==' ') {
		  count++;  
	  }
	  else {
	  count1++;
	  }
	 System.out.print(s.charAt(i)); 
	  
  }
  System.out.println("\nNo of words count is "+count);

  System.out.println("\nNo of words count is "+count1);
	}

}
