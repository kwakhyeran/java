package chap04;

import java.util.Scanner;

public class forExam02 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		// Scanner 클래스를 key로 할당하고
		System.out.println("단 : ");
		int a = key.nextInt(); 
		
		// 스캐너 클래스가 할당된 key에서
		// 숫자만 가능한 nextInt 메소드를 a에 할당한다
		for (int i = 1; i <= 9; i++) {

			System.out.println(a + " * " + (i) + " = " + (a * i));

		}
	}
}
