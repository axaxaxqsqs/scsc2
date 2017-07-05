package day8;

import java.io.File;

public class Problem6 {

	public static void dir(File fd) {
		String[] filenames = fd.list();
		
		for(String s : filenames){
			File f = new File(fd, s);
			long t = f.lastModified();
			System.out.print(s);
			System.out.print("\t타일 크기 : "+ f.length());
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
	}
	public static void main(String[] args){
		File f1 = new File("C:\\windows\\system.ini");
		File f2 = new File("C:\\Users\\CBNU\\Desktop\\새 폴더 (2)");
		File f3 = new File("C:\\Users\\CBNU\\Desktop");
		
		String res;
		if(f1.isFile())
			res = "파일";
		else
			res = "디렉터리";
		System.out.println(f1.getPath() + "은 "+ res + "입니다.");
		
		if(!f2.exists()){
			if(!f2.mkdirs())
				System.out.println("디렉터리 생성 실패");
		}
		if(f2.isFile())
			res = "파일";
		else
			res = "디렉터리";
		System.out.println(f2.getPath() + "은 "+ res + "입니다.");
		dir(f3);
		
		f2.renameTo(new File("C:\\Users\\CBNU\\Desktop\\새 폴더 (23)"));
		
		dir(f3);
	}

}
