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
		
		dictionary.put("병인양요", 1866);
		dictionary.put("오페르트도굴사건", 1868);
		dictionary.put("신미양요", 1871);
		dictionary.put("윤요호사건", 1875);
		dictionary.put("강화도조약", 1876);
		dictionary.put("종두법실시", 1879);
		dictionary.put("갑신정변", 1884);
		dictionary.put("을미사변", 1895);
		dictionary.put("대한제국성립", 1897);
		dictionary.put("경인선개통", 1899);
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
			System.out.println(nameList.get(i) + "가 시험을 봅니다.");
			System.out.println("=======================");
			System.out.print("[을미사변 신미양요 병인양요 갑신정변 윤요호사건]에서 일어난 순서대로 입력하세요 (입력을 마치면 end룰 입력) >>");
			
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
				return "불합격";
			}
		}
		return "합격";
	}
}
