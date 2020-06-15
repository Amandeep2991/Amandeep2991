// assigning values to the global and local variable 

package pkg8;

public class Methodcalc {

int a1;
int b1;

public void cal(int a, int b) {
	a1=a;
	b1=b;
	//System.out.println("Value of a:"+a);
}
public static void main(String[] args) {
	Methodcalc aman=new Methodcalc();
	System.out.println("Value of a1:" +aman.a1); //this will assign zero value 
	aman.cal(12,122);
	System.out.println("Value of a1:"+aman.a1);
	//System.out.println("Value of b1:" +aman.b1);
	
	System.out.println("*********Second Object ***********");
	Methodcalc aman1=new Methodcalc();
	System.out.println("Value of a1:"+aman1.a1);
	aman1.cal(10,100);
	System.out.println("Value of a1:"+aman1.a1);
}
}
