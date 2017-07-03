package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import lib.Attendance;
import lib.Grade;
import lib.Test;

public class TestApplication {
	public static void main(String[] args){
		LinkedList<String> nameList = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("교싱에 들어온 사람들을 입력하세요(등록학생 명단: 하니, 솔지, 은정, 지용, 태양[입력을 마치면 end를 끝에 입력]) >>");
		while(!(name = sc.next()).equals("end")) {
			nameList.addFirst(name);
		}
		Attendance at = new Attendance();
		at.checkAttendance(nameList);
		at.showAttendance();
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("시험을 보기 위해 시험문제를 만듭니다.");
		System.out.println("-----------------------");
		System.out.println();
		
		ArrayList<String> problems = new ArrayList<String>();
		problems.add("을미사변");
		problems.add("신미양요");
		problems.add("병인양요");
		problems.add("갑신정변");
		problems.add("윤요호사건");
		
		Test test = new Test();
		test.makeTest(problems);
		
		Grade grade = new Grade(test.doTest(nameList));
		grade.notifyGrade();
	}

}
