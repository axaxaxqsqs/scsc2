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
		
		studentList.put("�ϴ�", "absent");
		studentList.put("����", "absent");
		studentList.put("����", "absent");
		studentList.put("����", "absent");
		studentList.put("�¾�", "absent");		
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
		System.out.println("�ϴ��� �⼮ ����: " + studentList.get("�ϴ�"));
		System.out.println("������ �⼮ ����: " + studentList.get("����"));
		System.out.println("������ �⼮ ����: " + studentList.get("����"));
		System.out.println("������ �⼮ ����: " + studentList.get("����"));
		System.out.println("�¾��� �⼮ ����: " + studentList.get("�¾�"));
		System.out.println();
	}
	public ArrayList<String> getPresentList(){
		return presentList;
	}
}
