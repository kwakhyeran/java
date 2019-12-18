package chap04;

public class SwitchTest03 {

	public static void main(String[] args) {
		// switch의 조건문인 int로 casting될 수 있는 값을 담고 있는 변수, 연산식, 메소드
		double d = 1.5;
		/*
		 * switch(d){ }
		 */

		int data = 5;
		switch (data + 60) {
		case 'A': // '문자' 하면 자동변환 안에 아스키 코드가 장착
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		}
		// String도 가능
		String code = new String("a01");
		switch (code) {
		case "a01":
			System.out.println("A01");
			break;
		case "a02":
			System.out.println("A02");
			break;
		}
	}
}
