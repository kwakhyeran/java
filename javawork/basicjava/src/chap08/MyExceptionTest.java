package chap08;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("숫자입력:");
		int num = key.nextInt();
		try {
			if (num % 2 == 1) {
				// 사용자가 정의한 예외적인 오류상황
				throw new MyException("홀수를 입력했습니다.");  // 
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
