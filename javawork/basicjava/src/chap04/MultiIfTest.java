package chap04;

import java.util.Scanner;

//if ~ else i
public class MultiIfTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요");
		int ssn = key.nextInt();

		if (ssn == 1 || ssn == 3) {
			System.out.println("남자");

		} else if (ssn == 2 || ssn == 4) {
			System.out.println("여자");

		} else {
			System.out.println("기타");
		}
	}

}
