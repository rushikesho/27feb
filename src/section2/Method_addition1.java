package section2;

public class Method_addition1 {
 //introduction to method
	public void add(int a, int b) {
		System.out.println("\n" + "addition is" + " "+ (a+b));
		
	}
	public int add1() {
     int c =90;
     int k =79;
     int  a =c+k;
     return(a);
  
  }
	public static void main(String [] args) {
		Method_addition1 obj = new Method_addition1();
		obj.add(10, 20);
		obj.add(50, 80);
		System.out.println("after returning value i.e a addition is : " + obj.add1());
		
	}
}
