package day2;

public class Problem7 {

	public static void main(String[] args){
		int intArray[] = new int[5];
		intArray[0] = 0;
		
		for(int i = 0; i <=5; i++){
			try{
				intArray[i] = i + intArray[i];
				System.out.println("intArray["+i+"]="+intArray[i]);
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}
	}
}
