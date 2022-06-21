package dsa;

public class StringsEquals {

	public static void main(String[] args) {
		String a = "Rushi"; 
        String b = "Rushi";
        String s = new String("Rushi"); 
        String l = new String("Rushi");
        
        if(s==l) { // it only check its references l and s they are pointing towards different objects
        	        //for a and b they are pointing the same object
        	System.out.println("both are equal ");
        }
//        	else if(a.equals(b)) {
//        		System.out.println("both values are equal");
//        	}
//        	else if(a.equalsIgnoreCase(b)) {
//        		System.out.println("both values are equal after ignoring cases");
        //	}
        else {
        		System.out.println("not equal");
        	
        }
        
        
        }
	}


