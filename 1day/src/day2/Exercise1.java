package day2;

import java.util.Scanner;

public class Exercise1 {
	
	public static void sum(int start, int end){
		int sum=0;
		for( ; start<=end; start++){
			sum = sum +start;
			System.out.print(start);
			if(start == end){
				System.out.print("=");
				System.out.println(sum);
			}else
				System.out.print("+");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		sum(start, end);
	}
}
