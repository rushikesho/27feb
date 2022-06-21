package section1;
public class nested_for_loop_12 {
	public static void main(String[] args) {
		for(int i =1 ; i<=5 ;i++) {
			for(int j=20 ;j>=i ; j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}System.out.println();
		}
		for(int i =1 ; i<=5 ;i++) {
			for(int j=-15 ;j<=i ; j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(" *");
			}System.out.println();
	}
	}	
}

