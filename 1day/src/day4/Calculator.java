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
			System.out.println("���� " + Add(x, y) + "�Դϴ�.");
		}else if(z == "-"){
			System.out.println("���� " + Sub(x, y) + "�Դϴ�.");
		}else if(z == "*"){
			System.out.println("���� " + Mul(x, y) + "�Դϴ�.");
		}else{
			try{
			System.out.println("���� " + Div(x, y) + "�Դϴ�.");
			}catch(ArithmeticException e){
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}
	}

}
