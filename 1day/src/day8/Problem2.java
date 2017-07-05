package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);

		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\CBNU\\Desktop\\Song2.txt");
			FileInputStream fin = null;
			int s;
			while ((s = in.read()) != -1) {
				fout.write(s);
			}

			fout.close();
			fin = new FileInputStream("C:\\Users\\CBNU\\Desktop\\Song2.txt");

			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
