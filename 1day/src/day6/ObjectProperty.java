package day6;

class Point{
	int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//toString 오버라이딩
	public String toString(){
		return "Point(" + x + "," + y + ")";
	}
	//equals() 오버라이딩
	public boolean equals(Point p){
		if(this.x == p.x && this.y == p.y)
			return true;
		return false;
	}
}

public class ObjectProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		
		System.out.println(a.toString());
		
		if(b.equals(a)){
			System.out.println("a와 b가 같습니다.");
		}else
			System.out.println("a와 b가 다릅니다.");

	}

}
