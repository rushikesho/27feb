package section6;

public class Strings2 { 
	// important for interview
  //program to count no of spaces ' ' 
  //program to count no of  'i' character
	public static void main(String[] args) {
		String s ="Hello this is Velocity Training Institute ";
		int count1 = 0 ; 
		int count = 0 ;
		int len = s.length();
		for(int i = 0 ; i<=len-1 ;++i) 
		{
			if(s.charAt(i) ==' ') 
			
				count++ ;
			{
				if(s.charAt(i)=='i') {
					count1++ ;		
				}
			}	 
		}
		System.out.println("no of  spaces is = " + count);
		System.out.println("no of i is  = " + count1);
		
//		for(int i = 0 ; i<=len-1 ;++i) 
//		{
//			if(s.charAt(i)=='i') {
//                  			 temp = s.charAt(i);
//                  			 
////                  			s = s.substring(0, len-1) + j
////                  	              + s.substring(len-1 + 1);
////                  			 
//		
//			}
//		}
		
	}  

}
