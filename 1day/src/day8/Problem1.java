package day8;

import java.io.FileInputStream;
import java.io.IOException;

public class Problem1 {

	public static void main(String[] args) {
		FileInputStream in = null;

		try {
			in = new FileInputStream("C:\\Users\\CBNU\\Desktop\\Song.txt");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
