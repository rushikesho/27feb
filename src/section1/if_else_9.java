package section1;

public class if_else_9 {

	public static void main(String[] args) {
		
		int amount =500;
		
		if((amount/100 !=0)) // here ! (not) operator is used 
		{
			System.out.println("your transcation being processed");
			
             System.out.println(amount/100 !=0);
	    }
		else 
		{
			System.out.println("enter a valid amount");
        }
		
		
		
		if(amount%100==0)
		  {
			System.out.println("your transcation being processed");
			System.out.println(amount%100==0);

	       }
		else 
		{
			System.out.println("enter a valid amount");
       }
     }
   }