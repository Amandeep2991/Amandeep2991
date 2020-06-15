// use this keyword for constructor 

package pkg5;


public class Const {
	
	
	
	public Const ()
	{
		this(1,2,3); /// 3 Parameterized constructor 
		
	System.out.println("default parameterized");
    }
   
	public Const (int a)
	{

	System.out.println("one parameterized");
    }
	
	public Const (int a, int b)
	{
		this(); 
	System.out.println("two parameterized");
    }
	
	public Const (int a, int b, int c)
	{
		
	System.out.println("three parameterized");
    }
	
	
	public static void main(String[] args) {
		
		Const aman1=new Const(1,2);
		
	}
}
