import java.util.Scanner;

public class Exercise2 {
	
	public static double rectangle(double x1, double y1, double x2, double y2){
		double x3, y3;
		x3 = x2 - x1;
		y3 = y2 - y1;
		return x3*y3;
	}
	
	public static double circle(double c1){
		return c1*c1*3.14;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double x1,y1,x2,y2,c1, r1, c2;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		c1 = sc.nextDouble();
		r1 = rectangle(x1, y1, x2, y2);
		c2 = circle(c1);
		
		System.out.println("("+x1+","+y1+")에서 ("+x2+","+y2+")까지 마우스를 드래그한 사각형의 면적은 "+ r1 + "입니다.");
		System.out.println("원의 반지름이 "+c1+"일 때 원의 면적은 "+ c2 + "입니다.");
	}
}
