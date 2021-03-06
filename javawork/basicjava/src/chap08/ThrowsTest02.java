package chap08;

import java.util.Scanner;

//예외가 발생된 곳에서 예외를 처리하도록 정의
//예외가 발생된 곳에서 예외를 처리하면 호출하는 곳에서는 어떤 예외가 발생했는지 알 수 없고 
//예외가 발생할때 경우에 따라서 다르게 처리하고 싶어도 할 수 없다.
public class ThrowsTest02 {

	public int test(int num1, int num2) throws ArithmeticException { // 계산만하는 메소드
		// 위 int는 리턴을 위한 메서드
		int result = 0;

		System.out.println("-------test()메소드 내부 ------");
		System.out.println("입력값:" + num1);
		System.out.println("입력값:" + num2);
		result = num1 / num2;
		System.out.println("결과:" + result);
		System.out.println("-------test()메소드 내부 ------");

		return result;
	}
	// 예외를 호출하는곳에서 직접처리

	public void show() { // 숫자를 전달하며 test()를 호출하는 메소드

		Scanner key = new Scanner(System.in);
		int result = 0;
		int num1 = 0;
		int num2 = 0;

		try {
			System.out.print("숫자입력");
			num1 = key.nextInt();
			System.out.print("숫자입력");
			num2 = key.nextInt();
			result = test(num1, num2);
		} catch (ArithmeticException e) {
			// num1이 10의 배수면 result에 1000을 할당
			// num2이 7의 배수면 result에 10000을 할당
			// 그외 100으로 할당

			if (num1 % 10 == 0) {
				result = 1000;
			} else if (num2 % 7 == 0) {
				result = 1000;
			} else {
				result = 100;
			}
		}

		finally {// 무조건 실행되어야 하는 명령문
			System.out.println("test()호출결과 : " + result);
		}
	}

	public static void main(String[] args) {
		ThrowsTest02 obj = new ThrowsTest02();
		obj.show();
	}

}
