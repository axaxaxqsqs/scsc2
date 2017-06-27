package day4;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] b = new Book[3];
		
		System.out.println("타이틀, 저자, 국제표준도서번호를 입력하세요.");
		for(int x=0; x<b.length; x++){
			String t = sc.next();
			String a = sc.next();
			int i = sc.nextInt();
		
			b[x] = new Book(t, a, i);
		}
		for(int x=0; x<b.length; x++){
			System.out.print("타이틀: " + b[x].getTitle());
			System.out.print(" 저자: " + b[x].getAuthor());
			System.out.println(" 국제표준번호: " + b[x].getISBN());
		}
	}

}
