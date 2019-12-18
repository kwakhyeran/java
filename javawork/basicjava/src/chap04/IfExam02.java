package chap04;

import java.util.Scanner;

//성별과 나이를 받아서 다음과 같이 출력하기
//입력값 :1,3은남자 2,4는여자 
// 		나이 - 1~19살 청소년 
//			  20살 성인
public class IfExam02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("성별을 입력하세요 : ");
		int score = key.nextInt(); // 성별

		System.out.println("나이를 입력하세요 : ");
		int age = key.nextInt(); // 나이

		if (score == 1 || score == 3) {
			if (age < 20) {
				System.out.println("청소년 남자");
			} else {
				System.out.println("성인 남자");
			}
		} else {
			if ((score == 2) || (score == 4)) {
				if (age < 20) {
					System.out.println("청소년 여자");
				} else {
					System.out.println("성인 여자");
				}
			}
		}
	}
} // Ctrl + shift + f 를 누르면 코딩을 깔끔하게 정리해준다.