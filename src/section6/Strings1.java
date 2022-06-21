package section6;

public class Strings1 {

	public static void main(String[] args) {
		String a ="Velocity Kataraj";
		String b = "velocity KATARAJ";
      //  a = a + b ;
        System.out.println(a);
        
		String c = new String("second way of string declaration with the help of new keyword");
		//c= "omg" + b;
		System.out.println(c);
				
		System.out.println(a.charAt(2)); // help us to get character at particular index
		
		int length = a.length();  //to get length of string 
		System.out.println(length);
		
		boolean result = a.equals(b);  // to compare two string
		System.out.println(result);

		 String sub = a.substring(1);  //creates substring from index 1 
				 System.out.println(sub);
	     
        String sub1 = a.substring(1, 5); // creates substring from index 1 and print up to 4
        System.out.println(sub1);
        
        boolean re = a.equalsIgnoreCase(b); // ignore case (upper case or lower case) while comparing
        System.out.println(re);
        
        System.out.println(a.concat(" pune")); //adds new string to existing string not permanent in a variable 
        
        System.out.println(a);
        
        boolean value = a.contains("ity"); // matched character sequence
        System.out.println(value);
        
		 System.out.println(a.toLowerCase()); // changes string to lower case 
		
		 System.out.println(a.toUpperCase()) ; // changes string to upper case
		 
		 for(int i =length -1 ; i>=0 ; i --) {
			 
			 System.out.print(a.charAt(i));
			
		 }
		 	 
	}

}
