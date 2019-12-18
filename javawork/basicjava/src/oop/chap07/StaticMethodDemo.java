package oop.chap07;

//StaticMethodDemo
//-static 멤버를 제어하기 위한 용도
//-유틸리티처럼 자주 사용하는 메소드
public class StaticMethodDemo {

	public static void staticTest1() {
		// 1. static메소드에서 static메소드 호출 - 일반적인 방법가능
		staticTest2();
		System.out.println("staticTest1()");
	}

	public void display() {
		// 2. non-static메소드에서 non-static메소드 호출 - 일반적인 방법가능
		show();
		System.out.println("display()");
	}

	public static void staticTest2() {
		System.out.println("staticTest2()");
	}

		// 3 non- static에서 static 호출 - 일반적인 방법으로 호출
	public void show() { 
		staticTest2();        
		System.out.println("show()");
	}

	public static void staticTest3() {
		// 4. static메소드에서 non-static메소드 호출
		// ->non-static메소드가 메모리에 없기때문에 같은 클래서에서
		//	정의된 메소드라고 하더라도 무조건 객체생성 후에 호출해야한다.
	
		StaticMethodDemo obj =	new StaticMethodDemo(); // 이렇게 정의안하면 이 클래스에서 non-static호출은 하지못한다
		
		obj.show();   //객체생성안하면 인스턴스는 사용을 못함
		System.out.println("staticTest3()");
	}
}
