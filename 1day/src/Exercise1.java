import java.util.Scanner;

public class Exercise1 {

	public static double Max(double a, double b){
		double c = 0;
		if(a>b)
			c = a;
		else if(a<b)
			c = b;
		return c;
	}
	
	public static int Max(int a, int b){
		int c = 0;
		if(a>b)
			c = a;
		else if(a<b)
			c = b;
		return c;
	}
	
	public static void main(String[] args){
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = Max(a, b);
		
		System.out.println(a + "와(과) " + b + "중 큰수는 " + c + "입니다.");
	}
}
