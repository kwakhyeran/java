package oop.chap06;
//MyMethod 클래스에서 정의한 메소드를 사용하는 클래스
public abstract class MyMethodTest {
	public static void main(String[] args) {

		System.out.println("********프로그램 시작*********");

	MyMethod m =new MyMethod();
	//1. 
	m.display();


	System.out.println("=====================================");
	//2. 매개변수 한개, 리턴값이 없는 매소드의 호읍
	m.display("*");               
	m.display("§");
	m.display("★");

	System.out.println("=====================================");
	//3. 매개변수 2개
	m.display("Lee\t" ,5);     //display(String__, int__);
	m.display("*",10);               
	m.display("§",20);
	m.display("★",30);
	

	// 매개변수와 리턴값이 있는 메소드의 호출
	// 메소드를 호출하는 경우 리턴값이 존재하는 메소드라면
	//① 리턴값과 동일한 타입의 변수를 선언해서 저장해주어야한다.
	//② 다른 메소드의 매개변수로 전달할 수 있다.
	int sum = m.add(100,200);
	System.out.println("메소드 호출 결과 =>"+sum);        //1번

	System.out.println("메소드 호출 결과 =>"+m.add(100,200)); //2번
	
	System.out.println("********프로그램 종료*********");
	
	}
	
}
