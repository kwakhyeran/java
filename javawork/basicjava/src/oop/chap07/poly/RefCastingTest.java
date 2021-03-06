package oop.chap07.poly;
//객체의 형변환

class Parent {
	String name = "장동건";

	public void display() {
		System.out.println("부모의 display");
	}
}

class Child extends Parent {
	String name = "이민호";

	public void display() {
		System.out.println("자식의 display");
	}

	public void test() {
		System.out.println("하위클래스에만 정의된 메소드");

	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. super타입의 참조변수로 Super객체를 참조");
		Parent obj1 = new Parent();
		obj1.display(); // 장동건 출력
		System.out.println(obj1.name);
		System.out.println("************************");
		System.out.println("2. sub타입의 참조변수로 Sub객체를 참조");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * 객체의 형변환
		 */
		System.out.println("************************");
		System.out.println("3. super타입의 참조변수로 Sub객체를 참조");
		Parent obj3 = new Child(); // Parent에서 obj3이라는 참조변수를 Child에서 새롭게 정의
		obj3.display(); // 메소드:오버라이딩된 메소드가 호출
		System.out.println(obj3.name); // 변수 : 참조변수 타입에 해당하는클래스의 멤버변수가 호출

		// 타입이 Parent타입이지만 실제로 생성된 객체가 Child타입이기 때문에
		// Child타입으로 형변환이 가능하다.(명시적)
		((Child) obj3).test();

		System.out.println("************************");
		System.out.println("4. sub타입의 참조변수로 Super객체를 참조----x");
		// Child obj4 = new Parent();

		System.out.println("************************");
		System.out.println("5. sub타입의 참조변수 = " + " super타입의 참조변수(Super객체를 참조)");
		//명시적으로 형변환을 해서 컴파일러를 속였으나 실행시점에 캐스팅을 하려고 할때 
		//obj1이 Child정보를 갖고 있지 않으므로 캐스팅 예외발생
		//Child obj5 = (Child)obj1;                  

		System.out.println("************************");
		System.out.println("6. sub타입의 참조변수 = " + " super타입의 참조변수(Super객체를 참조)------o");
	
		
		Child obj6 = (Child)obj3;   		//obj3에 캐스팅을 해버림    obj3이 super타입이긴 하지만 
									 		//실제 Child를 참조하고 있기때문에.. 형변환이 가능
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
	}
}
