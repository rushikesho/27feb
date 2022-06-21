package section2;

public class Method2 {
	
  public void triangle () // non static method  
  {
	for(int a=1 ; a<=6 ; a++) {
		for(int b =1 ;b<=a ; b++) {
			System.out.print("*");
		}System.out.println();
	  } 
	
   } public void inverttriangle() { // non static so object creation needed
	   for(int a= 1; a<=5 ; a++) {
		   for(int b=5 ; b>=a ; b--) {
			   System.out.print("*");
		   }System.out.println();
	   }
   }
   public static void main (String [] args) {
	   Method2 obj = new Method2();
	   obj.triangle();
	   obj.inverttriangle();
	   obj.triangle();
	   obj.inverttriangle();
	   
   }
  }
