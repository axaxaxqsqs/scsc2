package day5;

class Unit{
	private int HP, strikingPower, defensivePover, x, y;
	
	public Unit(int x, int y){
		this.x = x; this.y = y;
	}
	public void attack(){
		System.out.println("왼손주먹");
	}
	public void move(int dx, int dy){
		this.x = this.x + dx;
		this.y = this.y + dy;
		System.out.println("현재 이 유닛의 위치는 (" +  this.x + "," + this.y + ") 입니다.");
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
		System.out.println("투투투투퉅ㅌ투투투투투");
	}
	public void talk(){
		System.out.println("저글링은 천박해~");
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
		System.out.println("이 유닛은 공격할 수 없습니다.");
	}
	public void talk(){
		System.out.println("도움이 필요하면 말씀하세요..");
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
		System.out.println("카아아앜 퉤퉤투테ㅜ테");
	}
	public void talk(){
		System.out.println("꾸어ㅓ어어엑");
	}
	public void steamPack(){
		
	}
}
class Luker extends Hydra{
	public Luker(int x, int y) {
		super(x, y);
	}
	public void attack(){
		System.out.println("이 유닛은 땅위에 올라오면 공격할수 없습니다.");
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
		
		System.out.println("<명령 : 유닛 부대를 3,4만큼 이동시켰다.>");
		for(int i=0; i<4; i++){
			unit[i].move(3, 4);
		}
		System.out.println();
		
		System.out.println("<명령 : 유닛들을 말하게 시켰다.>");
		for(int i=0; i<4; i++){
			unit[i].talk();
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println("전방에 적이 나타났다!!!");
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("<명령 : 모두 공격해라!>");
		for(int i=0; i<4; i++){
			unit[i].attack();
		}
	}

}
