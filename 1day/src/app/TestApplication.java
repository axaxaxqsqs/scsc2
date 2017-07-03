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
		
		System.out.print("���̿� ���� ������� �Է��ϼ���(����л� ���: �ϴ�, ����, ����, ����, �¾�[�Է��� ��ġ�� end�� ���� �Է�]) >>");
		while(!(name = sc.next()).equals("end")) {
			nameList.addFirst(name);
		}
		Attendance at = new Attendance();
		at.checkAttendance(nameList);
		at.showAttendance();
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("������ ���� ���� ���蹮���� ����ϴ�.");
		System.out.println("-----------------------");
		System.out.println();
		
		ArrayList<String> problems = new ArrayList<String>();
		problems.add("���̻纯");
		problems.add("�Ź̾��");
		problems.add("���ξ��");
		problems.add("��������");
		problems.add("����ȣ���");
		
		Test test = new Test();
		test.makeTest(problems);
		
		Grade grade = new Grade(test.doTest(nameList));
		grade.notifyGrade();
	}

}
