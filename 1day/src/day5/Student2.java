package day5;

class Person2{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return this.weight;
	}
}

public class Student2 extends Person2 {
	
	void set(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		setWeight(weight);
	}
	void personinfo(Student2 s){
		System.out.print(" �̸�: " + s.name);
		System.out.print(" ����: " + s.age);
		System.out.print(" Ű: " + s.height);
		System.out.print(" ������: " + s.getWeight());
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.set("�̸�", 24, 166, 58);
		s.personinfo(s);
	}

}
