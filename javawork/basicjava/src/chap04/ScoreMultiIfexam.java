package chap04;

import java.util.Scanner;

public class ScoreMultiIfexam {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.print("점수를 입력하시오 : ");

		int score = key.nextInt();

		if (score > 100 || score < 0) {
			System.out.print("잘못입력");
		} else {
			if (score >= 90) {
				System.out.print("A");
			} else if (score >= 80) {
				System.out.print("B");
			} else if (score >= 70) {
				System.out.print("C");
			} else if (score >= 60) {
				System.out.print("D");
			} else if (score >= 0) {
				System.out.print("F");
			}
		}
	}
}
