package chap08;

import java.util.Scanner;

public class ThrowsTest01 {
	public int test(int num1, int num2) throws ArithmeticException { // 계산만하는 메소드
		// 위 int는 리턴을 위한 메서드
		int result = 0;
		try {
			System.out.println("-------test()메소드 내부 ------");
			System.out.println("입력값:" + num1);
			System.out.println("입력값:" + num2);
			result = num1 / num2;
			System.out.println("결과:" + result);
			System.out.println("-------test()메소드 내부 ------");

		} catch (ArithmeticException e) {
			result = 0;

		}

		return result;
	}

	public void show() { // 숫자를 전달하며 test()를 호출하는 메소드

		Scanner key = new Scanner(System.in);
		System.out.print("숫자입력");
		int num1 = key.nextInt();
		System.out.print("숫자입력");
		int num2 = key.nextInt();
		int result = test(num1, num2);

		System.out.println("test()호출결과 : " + result);
	}

	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
	}

}
