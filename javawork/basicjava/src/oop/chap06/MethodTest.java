package oop.chap06;

import oop.chap6.constructor.Student;

//�޼ҵ��� �Ű������� ����Ÿ������ ������, �迭, �⺻�� ��� ����� �� �ִ�.
public class MethodTest {

	public static void main(String[] args) {

		Person p = new Person("�嵿��", "����", 45);

		display(p.getName(), p.getAddr(), p.getAge());
		display(p); // Person��ü�� �Ű������� �����Ҽ� �ִ�.

	}

	public static void display(String name, String addr, int age) {
		System.out.println(name + "," + addr + "," + age);

	}

	public static void display(Person p) {
		System.out.println(p.toString()); // p.toStiring �� p��ü�� �����ִ� ����

	}

	// �޼ҵ带 �����Ҷ� �� ���� ���� ������ �� �ִµ�
	// ������ Ÿ���� �����͸� ���� �� �����ؾ� �Ѵٸ� �迭�� ����Ÿ������ �����ϰ�
	// ����� �� �ִ�.
	public static int[] addNumber() {
		int[] myarr = new int[3];

		myarr[0] = 100;
		myarr[1] = 200;
		myarr[2] = 200;
		myarr[3] = 300;

		return myarr; // �迭�� ����
	}

	// Ÿ���̴ٸ� �������ǵ����͸� �����ϰ� ������� �迭�� ������ ��
	// �����Ƿ� �����ϰ� ���� ���� ���� �ִ� ��ü�� �����ؼ� �����Ѵ�.
	public static Student getInfo() {
		// student ��������� ����
		return new Student("�嵿��", 90, 100, 50, 30);
	}
}