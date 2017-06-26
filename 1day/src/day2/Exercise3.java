package day2;

import java.util.Scanner;

public class Exercise3 {
	
	public static int multi(int x, int y){
		int[][] mul = new int[9][9];
		for(int i=1; i<10; i++){
			for(int j=1; j<10; j++){
				mul[i-1][j-1] = i*j;
			}
		}
		try{
			return mul[x-1][y-1];
		}catch(ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int mul = multi(x, y);
		if(mul == 0){
			System.out.println("구구단의 범위를 넘었습니다.");
		}else
			System.out.println(mul);
	}
}
