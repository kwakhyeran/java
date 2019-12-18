package chap05;

import java.util.Random;

//배열의 선언, 생성, 초기화를 한꺼번에 처리하기
public class ArrayTest04 {

	public static void main(String[] args) {

		int[] myarr = { 10, 20, 30, 40, 50 }; // 배열을 생성하고 각각의 배열의 값을 선언
		// 이게 더 쉽게 느껴짐

		System.out.println("배열의 요소의 갯수 : " + myarr.length);

		for (int i = 0; i < myarr.length; i++) {
			System.out.println(myarr[i]);
		}
		// 자바언어 답게 선언, 생성, 초기화

		int[] myarr2 = { 10, 20, 30, 40, 50 };
		System.out.println("배열요소의 갯수 : " + myarr2.length);
		for (int i = 0; i < myarr2.length; i++) {
			System.out.println(myarr2[i]);
		}

		// 참조형 배열의 선언과 생성과 초기화를 한꺼번에
		String[] strArr = { new String("java"), // strArr의 배열의 갯수를 3개 선언하고 각각의 자리에 값을 생성
				new String("servlet"), new String("spring") };
		System.out.println("참조형배열요소의 갯수 : " + strArr.length);
		// 참조형 배열이기 때문에 객체가 할당된곳의 주소값이 출력되어야 하나
		// String이 예외
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		Random[] randArr = { new Random(), new Random() };
		// randArr을
		for (int i = 0; i < randArr.length; i++) {
			System.out.println("배열요소 =>" + randArr[i]);
		}

		String[] strArr2 = { "AAAAAAAA", "BBBBBBBBBB", "CCCCCCCCC", "DDDDDDDDDD" };
		System.out.println("갯수 : " + strArr2.length);

		for (int i = 0; i < strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}

	}
}
