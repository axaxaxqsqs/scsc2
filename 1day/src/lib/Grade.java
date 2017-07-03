package lib;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Grade {
	private Set<String> key;
	private Iterator<String> it;
	private HashMap<String, String> result;
	
	public Grade(HashMap<String, String> result) {
		this.result = result;
		key = this.result.keySet();
		it = key.iterator();
	}
	
	public void notifyGrade() {
		System.out.println("<-----테스트 결과----->");
		while(it.hasNext()){
			String name = it.next();
			String score = result.get(name);
			
			System.out.println(name + " : " + score);
		}
	}
}
