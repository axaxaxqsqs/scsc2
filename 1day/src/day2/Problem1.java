package day2;

public class Problem1 {
	
	public static void print(int x){
		
	}
	
	public static void main(String[] args){
		int sum = 0;
		
		for(int i=1; i<=10; i++){
			sum = sum +i;
			System.out.print(i);
			if(i==10){
				System.out.print("=");
				System.out.println(sum);
			}else
				System.out.print("+");
		}
	}
}
