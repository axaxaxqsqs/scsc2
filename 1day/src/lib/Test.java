package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test implements ITest {
	
	private HashMap<String, Integer> dictionary;
	private ArrayList<Integer> rightAnswer;
	private int order;
	
	public Test(){
		dictionary = new HashMap<String, Integer>();
		rightAnswer = new ArrayList<Integer>();
		order = 1;
		
		dictionary.put("���ξ��", 1866);
		dictionary.put("���丣Ʈ�������", 1868);
		dictionary.put("�Ź̾��", 1871);
		dictionary.put("����ȣ���", 1875);
		dictionary.put("��ȭ������", 1876);
		dictionary.put("���ι��ǽ�", 1879);
		dictionary.put("��������", 1884);
		dictionary.put("���̻纯", 1895);
		dictionary.put("������������", 1897);
		dictionary.put("���μ�����", 1899);
	}
	public void makeTest(ArrayList<String> unsort){
		for(int i=0;i<unsort.size();i++){
			rightAnswer.add(dictionary.get(unsort.get(i)));
		}
		Collections.sort(rightAnswer);
	}
	public HashMap<String, String> doTest(List<String> nameList) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> answer = new LinkedList<String>();
		String ans;
		
		HashMap<String, String> after = new HashMap<String, String>();
		
		for(int i=0;i<nameList.size();i++){
			System.out.println("=======================");
			System.out.println(nameList.get(i) + "�� ������ ���ϴ�.");
			System.out.println("=======================");
			System.out.print("[���̻纯 �Ź̾�� ���ξ�� �������� ����ȣ���]���� �Ͼ ������� �Է��ϼ��� (�Է��� ��ġ�� end�� �Է�) >>");
			
			while (!(ans=sc.next()).equals("end")) {
				answer.add(ans);
			}
			after.put(nameList.get(i), checkPass(answer));
			answer.removeAll(answer);
		}
		return after;
	}
	public String checkPass(LinkedList<String> answerSheet) {
		for(int i=0; i<answerSheet.size();i++){
			if(rightAnswer.get(i) != dictionary.get(answerSheet.get(i))){
				return "���հ�";
			}
		}
		return "�հ�";
	}
}
