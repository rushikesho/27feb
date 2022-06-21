package section1;

public class nested_if_else {

	public static void main(String[] args) {
	int abhi = 96;
	int ajinkya = 95 ;
	int akash = 96;
	
	if(abhi==ajinkya && abhi==akash)
	{
		System.out.println("no one is bigger");
	}
	else {
		if(abhi == ajinkya && abhi > akash)
		{
			System.out.println("both are greater");
		}
		else
		{
			if( abhi > ajinkya)
			{
				if(ajinkya>akash)
				{
					System.out.println("abhi is greater");
				}
				else 
				{
					System.out.println("akash is greater ");
				}
				
			} else {
				if (ajinkya > akash)
				{
					System.out.println("ajinkya is greater");
				}
				else {
					System.out.println("akash is greater");
				}
			 } 
		  } 	
	    } 
	    
	  }
	}
    
