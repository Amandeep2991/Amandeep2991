//query (((((10/2)+2)-2)-2)*2)


package pkg4;

public class Arth3 {
	
 public int div (int a, int b) {
	
	int c;
	c=a/b;
	System.out.println("Div Result:"+c);
	return c;
}
   public int sum (int c, int d) {
	   
	   int h;
	   h=c+d;
	   System.out.println("Sum Result:"+h);
	   return h;
   }
   public int sub (int c, int d) {
	   
	   int h;
	   h=c-d;
	   System.out.println("Sub Result:"+h);
	   return h;
   }
     public void mul (int c, int d) {
	   
	   int h;
	   h=c*d;
	   System.out.println("Mul Result:"+h);
	   
   }
     
     public static void main(String [] args) {
    	 
    	 Arth3 Math3=new Arth3();
    	 
    	 int div=Math3.div(10,  2); // assigning values to the 
    	 int sum=Math3.sum(div, 2);
    	 int sub=Math3.sub(sum, 2);
    	 int sub1=Math3.sub(sub, 2);
    	Math3.mul(sub1, 2);
     }
}
