package section6;

public class Strings4 {
	//important for interview
  //program to remove space in string
	public static void main(String[] args) {
		String s = "Hello this is Velocity Training Institute";
		String res=""; //empty string taken
		int len = s.length();
		for(int i = 0 ; i<=len-1 ; i ++) {
			if(s.charAt(i)==' ') { // for space occur at specific index
				
			res = res ;  // ' ' replaced by ""
		//when space occurs at specific index then we have given the res Sting which is empty(no change)	
			}else {
				res = res + s.charAt(i); 
			// adds the res value and character of s at specific index one by one
		    //res is sting so it store all sequence of character present in s string except space ' '
			}
		}System.out.println(res);

	}

}
