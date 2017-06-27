package day4;

class Goods2 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public Goods2(String n, int p, int nstock, int s) {
		name = n;
		price = p;
		numberOfStock = nstock;
		sold = s;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumerOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
}