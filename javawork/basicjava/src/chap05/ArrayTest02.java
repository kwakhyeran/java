package chap05;

import java.util.Random;
import java.util.Scanner;

//참조형 배열변수 사용하기
public class ArrayTest02 {
	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] randArr = new Random[5]; //randArr의 배열을 5개로 정의 
		Scanner[] keyArr = new Scanner[100];

		// 참조형 배열변수의 초기값은 null
		// null은 아무것도 참조하지 않는다는 의미 -> 그래서 참조형은 내가 정의해야함
		System.out.println(strArr[0]);
		System.out.println(randArr[0]);
		System.out.println(keyArr[0]);

		// 참조형 배열의 선언과 생성과 초기화 , 기본형은 값이 저장되있고 참조형은 주소가 저장되있다.
		// 그 결과 참조형 주소에 따른 값을 정의해야한다
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HRML5");
		System.out.println(arr[0]);
		// randArr의 초기화
		randArr[0] = new Random();       //randArr의 배열 0과 1은 랜덤값으로 정의->null값이 아닌 값이 나온다.
		randArr[1] = new Random();
	
		for(int i=0;i<randArr.length;i++) {//randArr.length을통해 randArr의 배열길이를 알수있다.
			System.out.println(randArr[i]);
		}
	}

}
