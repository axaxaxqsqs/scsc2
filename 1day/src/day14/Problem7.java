package day14;

public class Problem7 {

	public static void main(String[] args) {
		pro7 p7 = new pro7();
		
		Thread th1 = new WThread("kitae", p7);
		Thread th2 = new WThread("hyosoo", p7);
		
		th1.start();
		th2.start();
	}

}

class pro7{
	int sum = 0;
	synchronized void add(){
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	int getSum() {return sum;}
}

class WThread extends Thread {
	pro7 p7;
	WThread(String name, pro7 p7){
		super(name);
		this.p7 = p7;
	}
	public void run(){
		int i = 0;
		while(i<10){
			p7.add();
			i++;
		}
	}
}
