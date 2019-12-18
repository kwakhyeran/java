package oop.chap07;

public class IceCream extends Dessert {

	private int cal;

	public IceCream() {
	}

	public IceCream(String productName, int price, int count, int cal) {
		super(productName, price, count);   //부모클래스에서 받아옴
		this.cal = cal;    					//새로운 1개를 추가 > 오버라이딩
	}

	public static void print() {				//테스트에서 IceCream.print(); 
												//IceCream클래스에서 print()메소드를 출력
		System.out.println("============================");
		System.out.println("주문항목 " + "\t" +"가격 " + "\t" +"수량 " + "\t" +"칼로리");
		System.out.println("============================");

	}
	public void printProductInfo() {
		System.out.println(getProductName() +"\t" + getPrice() + "\t" +getCount() + "\t" +getCal() + "Kcal+");
	}
	
	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

}