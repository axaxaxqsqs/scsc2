package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Attendance implements IAttendance {
	private ArrayList<String> presentList;
	private HashMap<String, String> studentList;
	
	public Attendance(){
		presentList = new ArrayList<String>();
		studentList = new HashMap<String, String>();
		
		studentList.put("하니", "absent");
		studentList.put("솔지", "absent");
		studentList.put("은정", "absent");
		studentList.put("지용", "absent");
		studentList.put("태양", "absent");		
	}
	public void checkAttendance(List<String> arrayList){
		for(int i=0;i<arrayList.size();i++){
			presentList.add(arrayList.get(i));
			studentList.remove(arrayList.get(i));
		}
		for(int i=0;i<presentList.size();i++){
			studentList.put(presentList.get(i), "present");
		}
	}
	public void showAttendance(){
		System.out.println();
		System.out.println("하니의 출석 상태: " + studentList.get("하니"));
		System.out.println("솔지의 출석 상태: " + studentList.get("솔지"));
		System.out.println("은정의 출석 상태: " + studentList.get("은정"));
		System.out.println("지용의 출석 상태: " + studentList.get("지용"));
		System.out.println("태양의 출석 상태: " + studentList.get("태양"));
		System.out.println();
	}
	public ArrayList<String> getPresentList(){
		return presentList;
	}
}
