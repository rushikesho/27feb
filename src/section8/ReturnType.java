package section8;

 public    class ReturnType { //java.lang.String;

 public float  m() {
	 
	float  a =10f ;
    float b =20f ;
    float  c= a+b;    
    String d ="rushi";
    d= d+"Rthod";    
    System.out.println(d);
    System.out.println(d);	
    return(c); 
}
	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
      System.out.println(obj.m());			
	}
}
