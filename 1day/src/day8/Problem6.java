package day8;

import java.io.File;

public class Problem6 {

	public static void dir(File fd) {
		String[] filenames = fd.list();
		
		for(String s : filenames){
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\tŸ�� ũ�� : "+ f.length());
			System.out.printf("\t������ �ð� : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
	public static void main(String[] args){
		File f1 = new File("C:\\windows\\system.ini");
		File f2 = new File("C:\\Users\\CBNU\\Desktop\\�� ���� (2)");
		File f3 = new File("C:\\Users\\CBNU\\Desktop");
		
		String res;
		if(f1.isFile())
			res = "����";
		else
			res = "���͸�";
		System.out.println(f1.getPath() + "�� "+ res + "�Դϴ�.");
		
		if(!f2.exists()){
			if(!f2.mkdirs())
				System.out.println("���͸� ���� ����");
		}
		if(f2.isFile())
			res = "����";
		else
			res = "���͸�";
		System.out.println(f2.getPath() + "�� "+ res + "�Դϴ�.");
		dir(f3);
		
		f2.renameTo(new File("C:\\Users\\CBNU\\Desktop\\�� ���� (23)"));
		
		dir(f3);
	}

}
