package workbook67p;

public class CalcTest {

	public static void main(String[] args) {

		 Calulator obj = new Calulator(); // 메소드
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		double result = obj.divide(num1,num2);
		System.out.println("결과 = " + result);
	}

	
}

