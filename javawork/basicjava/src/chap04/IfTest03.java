package chap04;

import java.util.Scanner;
//중첩 if문 - if문 안에 if문 정의하고 사용하기 (모든 제어문을 중첩할 수 있다.)
public class IfTest03 {

	public static void main(String[] args) {
		//Scanner로 점수를 입력받아 90점이상하면 "통과"를 출력하고
		//90점미만이면 "재시험"을 출력하세요
		Scanner key = new Scanner(System.in);
		System.out.print("시험점수 : ");
		int jumsu = key.nextInt();
		
		System.out.print("응시횟수 : ");
		int count = key.nextInt();		//응시횟수
	
		if(jumsu >=90) {
			System.out.println("통과 ");
		
		}else {
			if(count > 3) {
				System.out.println("처음부터 다시시작 ");
			}else {
				System.out.println("이과목만 재시험");	
			}
		
		}
		
	}

}//시험점수if문 안에 응시횟수if문을 넣어 중첩을제어문을 형성
