package oop.chap06;

//메소드 정의하는 연습을 위한 클래스
public class MyMethod {

	//4. 매개변수, 리턴값이 모두 있는 메소드
	//=> 숫자 2개를 매개변수로 전달받아 더해서 결과를 리턴하는 메소드
	//   매소드 선언부에 리턴타입을 정의하는 경우 반드시 메소드의 마지막에서 값을 return해야한다.
	public int add(int a, int b) {
		int sum = 0; 
		sum = a + b;
		return sum;
	}
	
	//3. 리턴값이 없고 매개변수가 두개인 매소드
    // => 출력기호, 출력할 횟수를 매개변수로 전달 받아 사용할 수 있도록
	//	      메소드를 정의하고, MyMethodTest.java 에서 호출하기
	public void display(String a, int count) {
   
		for (int i = 1; i <= count; i++) {
			System.out.print(a);
		
		}
		System.out.println();

	}
	// 2. 리턴값이 없고 매개변수가 한개인 매소드
	public void display(String str) { //String 타입으로 데이터를 받고있기 때문에 값을 넘겨줄수있다.
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();

	}
	// 1. 매개변수가 없고 리턴값이 없는 메소드

	public void display() {

		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void display(int data) {
		
	}
	
	public void display(String a, long count) {}
	

}
