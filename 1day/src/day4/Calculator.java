package day4;

import java.util.Scanner;

public class Calculator {
	
	int x, y;
	
	public static int Add(int x, int y){
		return (x+y);
	}
	public static int Sub(int x, int y){
		return (x-y);
	}
	public static int Mul(int x, int y){
		return x*y;
	}
	public static double Div(int x, int y){
		return x/y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		String z;
		
		x = sc.nextInt();
		z = sc.next();
		y = sc.nextInt();
		
		if(z == "+"){
			System.out.println("답은 " + Add(x, y) + "입니다.");
		}else if(z == "-"){
			System.out.println("답은 " + Sub(x, y) + "입니다.");
		}else if(z == "*"){
			System.out.println("답은 " + Mul(x, y) + "입니다.");
		}else{
			try{
			System.out.println("답은 " + Div(x, y) + "입니다.");
			}catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}

}
