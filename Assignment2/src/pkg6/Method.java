// use this keyword to to call methods 

package pkg6;

public class Method {
	//int a, int b, int c, int d, int e;
	
	
	public void  method1() {
		this.method4(1,2,3);
		System.out.println("Default method");
		
	}
	public void method2(int a) 
	{
		this.method1();
		System.out.println("one parametrized method");
	
	}
	public void method3(int a, int b)
	{
		  this.method2(1);
	    this.method5(1,2,3,4);
		System.out.println("two parametrized method");
	
	}
	public void method4(int a, int b, int c) 
	{
		
		System.out.println("three parametrized method");
	
	}
	public void method5(int a, int b, int c, int e) 
	{
		
		System.out.println("four parametrized method");
	
	}
	
	public static void main (String[] args) {
	Method aman=new Method();
	aman.method3(1,2);
	}
	
}
