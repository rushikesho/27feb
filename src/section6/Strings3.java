package section6;
public class Strings3 {
	//important for interview
	//program to replace 'i' character with 'j' character
	public static void main(String[] args) {
		String s = "Hello this is Velocity Training Institute";
		String res = "";
		for(int i =0 ; i<=s.length()-1;i++) {
			
			if(s.charAt(i)== 'i') { //for i = 0 condition is false
				//res +='j' ;
				res= res + 'j' ;

	}  else {
				//res += s.charAt(i);
			  res = res + s.charAt(i); //this code is execute if i=0 and value at zero index get added in res 	
			
			}
		} System.out.println(res);
	
	}
	}

//		logic of code 
//      String c = "rushi";
//		String r = "";
//	    r = r + 'o';
//	    System.out.println(r);
//	    r = r +c.charAt(1);
//	    System.out.println(r);
   
	
