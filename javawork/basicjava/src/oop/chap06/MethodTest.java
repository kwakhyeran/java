package oop.chap06;

import oop.chap6.constructor.Student;

//메소드의 매개변수와 리턴타입으로 참조형, 배열, 기본형 모두 사용할 수 있다.
public class MethodTest {

	public static void main(String[] args) {

		Person p = new Person("장동건", "서울", 45);

		display(p.getName(), p.getAddr(), p.getAge());
		display(p); // Person객체를 매개변수로 전달할수 있다.

	}

	public static void display(String name, String addr, int age) {
		System.out.println(name + "," + addr + "," + age);

	}

	public static void display(Person p) {
		System.out.println(p.toString()); // p.toStiring 는 p객체가 갖고있는 정보

	}

	// 메소드를 정의할때 한 개의 값만 리턴할 수 있는데
	// 동일한 타입의 데이터를 여러 개 리턴해야 한다면 배열을 리턴타입으로 정의하고
	// 사용할 수 있다.
	public static int[] addNumber() {
		int[] myarr = new int[3];

		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 200;
		myarr[3] = 300;

		return myarr; // 배열을 리턴
	}

	// 타입이다른 여러개의데이터를 리턴하고 싶은경우 배열로 리턴할 수
	// 없으므로 리턴하고 싶은 값을 갖고 있는 객체를 생성해서 리턴한다.
	public static Student getInfo() {
		// student 모든정보를 리턴
		return new Student("장동건", 90, 100, 50, 30);
	}
}
