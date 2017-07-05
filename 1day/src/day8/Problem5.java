package day8;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);

		BufferedOutputStream out = new BufferedOutputStream(System.out, 10);

		try {
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			out.flush();
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.print("입출력 오류");
		}
	}
}
