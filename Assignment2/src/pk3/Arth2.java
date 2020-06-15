// query  ( (((10+2)+2)-2)*2)/2) 

package pk3;

public class Arth2 {
	
	public int sum (int m,int n) {
		int p;
		p=(m+n);
		System.out.println("Sum Result:"+p);
		return p;
	   
   }
    public int sub (int x, int y) {
    	int z;
    	z=x-y;
    	System.out.println("Sub Result:"+z);
    	return z;
    }
    
   public int mul (int m, int n) {
	   int p;
	   p=m*n;
	   System.out.println("Mul Result:"+p);
	   return p;
   }
   public void div (int a, int b) {
	   int c;
	   c=a/b;
	   System.out.println("Final Values:"+c);
   }
   
   public static void main(String[] args) {
	   Arth2 Cal=new Arth2();
	   
	   int sum=Cal.sum(10, 2);
	   int sum2=Cal.sum(sum,2);
	   int sub=Cal.sub(sum2, 2);
	   int mul=Cal.mul(sub,2);
	   Cal.div(mul, 2);
	   
	   
   }
}
