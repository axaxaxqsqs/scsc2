package day4;

class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won){
		return won/rate;
	}
	public static double toKWR(double dollar){
		return dollar*rate;
	}
	public static void setRate(double r){
		rate = r;
	}
}

public class Problem {
	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);
		System.out.println("�鸸���� " + CurrencyConverter.toDollar(1000000)+ "�޷��Դϴ�.");
		System.out.println("��޷��� " + CurrencyConverter.toKWR(100) + "���Դϴ�.");

	}

}