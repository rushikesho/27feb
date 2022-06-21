package section2;

  public class Method {
	  
  public void triangle(int c) {
	 for(int a=1 ; a<=c ; a++) {
		 for(int b=1 ; b<=a; b++) {
			 System.out.print("*");
		 }System.out.println();
	 }
 }
 
	public static void main(String[] args) {
		Method obj = new Method();
		obj.triangle(5);
		obj.triangle(8);
		obj.triangle(10);
		obj.triangle(12);
	}
}
