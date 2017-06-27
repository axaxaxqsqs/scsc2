package day4;

import java.util.Scanner;

public class GoodsArray {
	public static void main(String[] args){
		Goods2 goodsArray[];
		goodsArray = new Goods2[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<goodsArray.length; i++){
			String name = sc.next();
			int price = sc.nextInt();
			int n = sc.nextInt();
			int sold = sc.nextInt();
			goodsArray[i] = new Goods2(name, price, n, sold);
		}
		for(int i=0; i<goodsArray.length; i++){
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumerOfStock() + " ");
			System.out.println(goodsArray[i].getSold() + " ");
		}
	}
}