import java.util.Scanner;

public class Exercise3 {
	
	public static boolean isAlphabet(int i){
		if(i>64&&i<91||i>96&&i<123)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.next().charAt(0);
		
		if(isAlphabet(a)){
			if(Character.isUpperCase((char)a))
				a = Character.toLowerCase((char)a);
			System.out.println((char)a);
		}
		System.out.println("영문자가 아닙니다.");
	}
}
