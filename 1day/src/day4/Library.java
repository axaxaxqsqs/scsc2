package day4;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] b = new Book[3];
		
		System.out.println("Ÿ��Ʋ, ����, ����ǥ�ص�����ȣ�� �Է��ϼ���.");
		for(int x=0; x<b.length; x++){
			String t = sc.next();
			String a = sc.next();
			int i = sc.nextInt();
		
			b[x] = new Book(t, a, i);
		}
		for(int x=0; x<b.length; x++){
			System.out.print("Ÿ��Ʋ: " + b[x].getTitle());
			System.out.print(" ����: " + b[x].getAuthor());
			System.out.println(" ����ǥ�ع�ȣ: " + b[x].getISBN());
		}
	}

}
