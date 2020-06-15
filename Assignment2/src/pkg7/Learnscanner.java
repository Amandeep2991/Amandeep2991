// use of scanner and query was : (((((x1+x2)-X3)+x4)*x5)/x6)


package pkg7;

import java.util.Scanner;

public class Learnscanner {
	
	public int sum(int x1,int x2) {
	int y1;
	y1=x1+x2;
	
	System.out.println("Sum of values:"+y1);
	return y1;
}


	public int sub(int x3, int a1) {
	   int y2;
	   y2=x3-a1;
	
	System.out.println("Sub of values:"+y2);
	return y2;
	}

	 
	public int mul (int x5, int a2) {
	int y3;
	y3=x5*a2;
	
	System.out.println("mul of values:"+y3);
	return y3;
	}
	
	public void  div (int x6, int a2) {
	int y4;
	y4=x6/a2;
	
	System.out.println("Final values:"+y4);
	
	}


public static void main(String[] args) {
	Learnscanner ref=new Learnscanner();
	Scanner S=new Scanner (System.in);
	
	
	System.out.println("Enter the value of x1 for sum :");
	int x1= S.nextInt();	
	System.out.println("Enter the value of x2 for sum :");
	int x2=S.nextInt();
	int sum1=ref.sum(x1, x2);
	
	System.out.println("Enter the value of x3 for sub:");
	int x3= S.nextInt();	
	int sub1=ref.sub(sum1, x3);
	
	System.out.println("Enter the value of x4 for sum :");
	int x4= S.nextInt();	
	int sum2=ref.sum(sub1, x4);
	
	System.out.println("Enter the value of x5 for mul:");
	int x5= S.nextInt();	
	int mul1=ref.mul(sum2, x5);
	
	System.out.println("Enter the value of x6 for div:");
	int x6= S.nextInt();	
	ref.div(mul1, x6);
}
}


