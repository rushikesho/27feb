package section1;

public class if_else_3 {

	public static void main(String[] args) {
		int a =1;
		int b =2;
		int c =3;
		
		if(a==b &&b==c)
		{
			System.out.println("all are equal");
			
		}else {
			if(a==b&&a>c) {
				System.out.println("a and b are greater");
			}else {
				if(a==c && a>b) {
					System.out.println("a and c are greater");
				}else {
					if(b==c && b>a ) {
						System.out.println("b and c are greater");
					}else {
						if(a>b && b>c) {
							if(b>c) {
								System.out.println("a is greater");
							}else {
								if((b>a && a>c )||(b>a && a<c)) {
									System.out.println("b is greater");
								}else {
									if((c>a && a>b) || (c>a && a<b)) {
										
									
									System.out.println("c is greater");
								} 
							}
								}
						}
					}
				}
			}
		}
	}
}
