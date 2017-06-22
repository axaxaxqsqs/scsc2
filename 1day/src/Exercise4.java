import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char a = 'a';
		
		try{
			while(true){
				int i = sc.nextInt();
				if(sc.hasNext()==false)
					break;
				if(i>=90)
					a = 'A';
				else if(i>=80)
					a = 'B';
				else if(i>=70)
					a = 'C';
				else
					a = 'D';
				
				System.out.println("학점은 " + a + "입니다.");
			}
		}
		catch (IOException e){
			System.out.println("입력 오류");
		}
	}
}
