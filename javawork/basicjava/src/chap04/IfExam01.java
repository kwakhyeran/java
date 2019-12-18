package chap04;

import java.util.Scanner;

//숫자를 받아서 양수 or 음수 출력하고, 단 양수인경우 짝수인지 홀수인지 출력하기

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner key =new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 : ");
		int score = key.nextInt(); // nextInt는 무작위로 숫자를 받는거
		
		if(score >= 0) {
			if((score%2)==0) {
				System.out.println("짝수입니다");
			}else{
				System.out.println("홀수입니다");
			}
		}else {
			System.out.println(score+"는 음수입니다");
		}
	}
}