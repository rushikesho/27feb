package practise1;

public class Reverse_no {

	public static void main(String[] args) {
		int num = 453 ;
		int rev = 0 ;
		int orgNum = num;
		while(num!=0) {
			rev = rev*10 + num%10 ;//
			num = num/10 ;
			
		}System.out.println("original   no  is  " +orgNum);
		System.out.println("reverse no is " + rev);
		
	}

}
