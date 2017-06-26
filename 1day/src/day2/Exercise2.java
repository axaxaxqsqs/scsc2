package day2;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while((i=sc.nextInt()) != -1){
			System.out.println();
			for(int x = 1; x<10;x++)
				System.out.println(i+"*"+x+"="+i*x);
		}
	}
}
