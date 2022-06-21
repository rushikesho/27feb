package section1;
public class nested_if_else2 {

	public static void main(String[] args) {
		int marks = 98;
		
		if(marks >= 0 && marks <= 100)
		{
			if(marks >=90)
			{
				System.out.println("A + grade");
			} else {
				if(marks >= 80)
				{
					System.out.println(" A grade ");
				} else {
					if(marks >=70)
					{
						System.out.println( " B+ grade");
					}else {
						if(marks >=60)
						{
							System.out.println("B grade");
						}else {
							if(marks >=40)
							{
								System.out.println(" c grade");
							}else {
								
								System.out.println("failed");
							}
						}
					}
				}
			}
		} else {
			System.out.println("enter valid marks");
		}
	}
}
