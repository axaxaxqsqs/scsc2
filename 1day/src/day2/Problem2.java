package day2;

public class Problem2 {
	
	public static void main(String[] args){
		for(int i=1; i<10; i++){
			System.out.println();
			for(int j=1; j<10; j++){
				System.out.print('\t');
				System.out.print("|  " + j + "*" + i + "=" + i*j);
			}
		}
	}
}
