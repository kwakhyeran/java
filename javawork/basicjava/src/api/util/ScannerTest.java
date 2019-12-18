package api.util;

import java.util.Scanner;

//scanner클래스(API)의 사용방법
//=> 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공하는 클래스

public class ScannerTest {

	public static void main(String[] args) {
	Scanner key = new Scanner(System.in);     //Scanner 클래스를 생성하고 이를 key에 할당한다
	//스캐너는 키보드를 받기위한 메소드
	System.out.println("문자열을 입력하세요 : ");
	
	String data = key.next();  //next는 콘솔키보드로 받는것,
	//key를 스캐너 클래스를 할당했기때문에 그 안에 메소드인 next를 활용하는..
	// next는 이전에것들은 불러일으키는 메소드
	System.out.println("키보드로 입력받은 문자열:"+data);
	
	System.out.print("숫자를 입력하세요 :");
	
	int intVal = key.nextInt();
	
	System.out.println("입력받은숫자"+intVal);
	}
}
