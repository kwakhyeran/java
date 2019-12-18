package chap04;

import java.util.Scanner;

// Switch 연습 - 기본문법
// Switch문의 특성을 활용 
public class SwichTest02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.print("주민번호를 입력하시오 : ");
		int ssn = key.nextInt();

		switch (ssn) {
		// switch문은 true of false가 아니라 평가할 값이 저장된 변수
		case 1:
		case 3:
			System.out.println("남자");
			break;
	
		case 2:
		case 4:
			System.out.println("여자");
			break;
	
		default:
			System.out.println("기타");
			break;
		}

	}

}
