//query is solve (10+2)(10-2)

package pk2;

public class Arth {
 
	public int sum(int a,int b) {
		
		int sum_result;
		 sum_result = (a+b);
		
		
		System.out.println("sum of the values:"+sum_result);
		return sum_result;
	}
	
	public int sub(int m, int n) {
		int sub_result;
		 sub_result=(m-n);
		 
		 System.out.println("Subtract of the values:"+sub_result);
		 return sub_result;
	}
	public void mul(int sum_result, int sub_result) {
		int mul_result;
		mul_result=  (sum_result*sub_result);
		
		System.out.println("multiple of the values:"+mul_result);
	}

	public static void main(String[] args) {
		Arth Aman=new Arth();
		int sum_result=Aman.sum(10,2);
		int sub_result=Aman.sub(10,2);
	Aman.mul(sum_result, sub_result);
		
	}


}


