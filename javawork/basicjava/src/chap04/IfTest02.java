package chap04;

import java.util.Scanner;
//if~else문과 Scanner
public class IfTest02 {

	public static void main(String[] args) {
		//Scanner로 점수를 입력받아 90점이상하면 "통과"를 출력하고
		//90점미만이면 "재시험"을 출력하세요
		Scanner key = new Scanner(System.in);
		System.out.print("점수를 입력하세요 :");
		int jumsu = key.nextInt();
		
		if(jumsu >=90) {
			System.out.print("통과 ");
		}else {
			System.out.print("재시험"); // print와 println 차이점 = 입력을 
									  	//옆으로 하냐 밑으로으로 하냐 차이
		}
		
	}

}