package chap04;

import java.util.Scanner;

public class ScoreSwitchExam {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.print("점수를 입력하시오 : ");

		int score = key.nextInt();

		if (score > 100 || score < 0) {
			System.out.print("잘못입력");
		} else {

			switch (score / 10) {
			case 10:
			case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			case 6:
				System.out.print("D");
				break;
			default:
				System.out.print("F");
				break;
			}
		}
	}
}
