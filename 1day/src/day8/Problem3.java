package day8;

import java.io.FileReader;
import java.io.IOException;

public class Problem3 {

	public static void main(String[] args) {
		FileReader in = null;

		try {
			in = new FileReader("C:\\Users\\CBNU\\Desktop\\Song3.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
