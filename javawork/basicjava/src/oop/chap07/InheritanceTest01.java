package oop.chap07;
/*
 * ㅅ <<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서는 상위클래스에 정의된 멤버변수를 하위클래스에서 사용할수 ㅣㅇㅆ다.
 * 2. 상위클래스의 변수와 동일한 이름의 변수를 하위클래스에 정의하는 경우 하위클래스 멤버 변수의 우선순위가 더 높다.
 *3.부모클래스의 변수를 엑세스하려면 super를 이용해서 접근한다.
 *	this ->자기자신의 객체
 *	super ->부모 객체
 *	4. 상위클래스에  private으로 선언된 변수는 상속관계에 있다고 하더라도 하위 클래스에서 접근할 수 없다.
 */



class Super {
	private int num = 100;
}

class Sub extends Super { // 클래스
	public void display() { // 매소드
		int num = 1000;
		System.out.println("num=>" + num);
		System.out.println("부모의  num=>" + super.num);

	
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		// 상위클래스는 하위 클래스의 일반적인 내용을 정의하기 위해서 사용하는 클래스이므로 주로 하위클래스를 생성해서 사용한다.
		Sub obj = new Sub();      //변수 obj를 만든다
		obj.display(); // 상위클래스의 메소드를 출력
		System.out.println("main=>" + obj.num);
		
	}
}
