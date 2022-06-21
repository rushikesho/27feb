package section5;
public class Constructor_5 {
	Constructor_5(){
		System.out.println("hi hello I am Constructor_5 ");
	}
	Constructor_5(int a){ //constructor overloading
		System.out.println(a);
	}
	Constructor_5(int a,int b){
		System.out.println(a+b);
		
	}
	Constructor_5(int a , String b){
		System.out.println(a);
		System.out.println(b);		
	}
    Constructor_5(String a , int b){    
	System.out.println(a);
	System.out.println(b);
    }
    Constructor_5(String a, String b){
    	System.out.println(a + b);	
    }
	public static void main(String[] args) {	
		Constructor_5 obj = new Constructor_5();
		Constructor_5 obj1 = new Constructor_5(10);
		Constructor_5 obj6 = new Constructor_5(100);
		Constructor_5 obj2 = new Constructor_5(10,20);
		Constructor_5 obj3 = new Constructor_5(55,"hi");
		Constructor_5 obj4 = new Constructor_5("hello", 45);
		Constructor_5 obj5 = new Constructor_5("hi","hello");
	}
}
