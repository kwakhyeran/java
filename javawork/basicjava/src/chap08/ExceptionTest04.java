package chap08;

import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		try {
			System.out.print("배열의 요소 갯수를 입력하세요:");
			int size = key.nextInt();
			String[] arr = new String[5];
			
			System.out.println("step01");
			
			if (size > 3) {
				arr[1] = new String("java");       //문자열의 길이 : 4 
				}System.out.println(arr[1].length());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 요소를 잘못액세스...");
		}catch (NullPointerException e) {
			System.out.println("널입니다.");
		}catch (Exception e) {
			System.out.println("오류입니다.");
		}finally {          //무조건 실행
			System.out.println("반드시 실행할 명령문 - 무조건실행");

		}

	}
}
