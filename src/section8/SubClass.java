package section8;
public class SubClass extends SuperClass {// here we are extending all the super class properties through inheritance 
	int a ;//sub class global variable 
	static int b ; //static global variable 
	SubClass(){
		System.out.println("this is sub class constructor");
		}
	SubClass(int a){
	
	super.rushi(45);
		System.out.println("hi this is sub class parameter constructor " + a);
	}
	public void sub() { // sub class method or child method 
		System.out.println("hi this is sub class method ");
	}
   public void  sub1() { //sub class method
	   super.test();//it call to super class method and we can't use super.test() in static method
	   test2();//super class method static 
	   System.out.println("this is sub class method ");
   }
   public void test() {
	   //here super keyword refers to super class elements such as variables and methods 
	 int b = super.a=56; //takes super class global variable
     System.out.println("we are using super keyword for super class non static global variable " + (super.a=57));
     //print super class global variable non static  
	   System.out.println(b);
	 System.out.println("we are using super kerword for super class static global variable " + (super.b=77)); 
	//print super class global variable static 
	   super.test();//I  have called super class non static method in sub class non static method non static 
	  System.out.println("sub class method name is  test "); 
   }
   public static void test3() {
	  
	   System.out.println("this is static sub class method ");
	   
   }
   public  void rushi(int a) {
	   System.out.println("sub class value " + a);
   }
	public static void main(String[] args) {
		
	SubClass obj = new SubClass();
	//when we create the object for sub class both super class and sub class constructor called same time
	
	SubClass obj3 = new SubClass(100); //sub class can't call to parameterized constructor of super class 
	SubClass  obj2 = new SubClass(54);//only calls to subclass parameter constructor 
	//but  it can call zero argument constructor of super class
		
	obj.sub();//sub class non  static method 
	obj.sub1();//sub class non static method 
	obj.test();//sub class non static method 
	SubClass.test3();//sub class static method 
		
		//super class methods calling start here
       obj.rushi();  
   //  SuperClass obj1 = new SuperClass(54);//only call to parameter constructor of super class
       
       obj.rushi(89);//calls to sub class parameter method
       obj.rushi(10);//calls to sub class parameter method
       System.out.println(obj.a=20); //calls or takes sub class global variable  
       System.out.println(SubClass.b=99);//sub class static global variable
	}
}
