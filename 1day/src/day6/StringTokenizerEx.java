package day6;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		
		while(st.hasMoreElements())
			System.out.println(st.nextToken());
	}

}
