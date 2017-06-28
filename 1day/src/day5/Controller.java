package day5;

class Unit{
	private int HP, strikingPower, defensivePover, x, y;
	
	public Unit(int x, int y){
		this.x = x; this.y = y;
	}
	public void attack(){
		System.out.println("�޼��ָ�");
	}
	public void move(int dx, int dy){
		this.x = this.x + dx;
		this.y = this.y + dy;
		System.out.println("���� �� ������ ��ġ�� (" +  this.x + "," + this.y + ") �Դϴ�.");
	}
	public void talk(){
		System.out.println("...");
	}
}
class Marine extends Unit{
	private int attackSpeed;
	public Marine(int x, int y) {
		super(x, y);
		attackSpeed = 0;
	}
	public void attack(){
		System.out.println("���������T������������");
	}
	public void talk(){
		System.out.println("���۸��� õ����~");
	}
	public void steamPack(){
		attackSpeed++;
	}
}
class Medic extends Unit{
	public Medic(int x, int y) {
		super(x, y);
	}
	private int MP = 100;
	
	public void attack(){
		System.out.println("�� ������ ������ �� �����ϴ�.");
	}
	public void talk(){
		System.out.println("������ �ʿ��ϸ� �����ϼ���..");
	}
	public void healing(){
		MP--;
	}
}
class Hydra extends Unit{
	public Hydra(int x, int y) {
		super(x, y);
	}
	public void attack(){
		System.out.println("ī�ƾƝ� ơơ���פ���");
	}
	public void talk(){
		System.out.println("�پ�þ�");
	}
	public void steamPack(){
		
	}
}
class Luker extends Hydra{
	public Luker(int x, int y) {
		super(x, y);
	}
	public void attack(){
		System.out.println("�� ������ ������ �ö���� �����Ҽ� �����ϴ�.");
	}
	public void DiginTheGround(){
		
	}
}


public class Controller {

	public static void main(String[] args) {
		Unit unit[] = new Unit[4];
		
		unit[0] = new Marine(0,0);
		unit[1] = new Medic(0,1);
		unit[2] = new Hydra(1,0);
		unit[3] = new Luker(1,1);
		
		System.out.println("<��� : ���� �δ븦 3,4��ŭ �̵����״�.>");
		for(int i=0; i<4; i++){
			unit[i].move(3, 4);
		}
		System.out.println();
		
		System.out.println("<��� : ���ֵ��� ���ϰ� ���״�.>");
		for(int i=0; i<4; i++){
			unit[i].talk();
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println("���濡 ���� ��Ÿ����!!!");
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("<��� : ��� �����ض�!>");
		for(int i=0; i<4; i++){
			unit[i].attack();
		}
	}

}
