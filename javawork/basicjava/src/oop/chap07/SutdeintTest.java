package oop.chap07;

public class SutdeintTest {

	public static void main(String[] args) {

		Student stu1 = new Student("kim  ", 100   , 90, 95, 64,50); // ���� Person�̶�� Ŭ������ ���� => APIŬ���� ������ �Ȱ���

		Student stu2 = new Student("lee  ", 62   , 43, 56, 31,40); // ���� Person�̶�� Ŭ������ ���� => APIŬ���� ������ �Ȱ���

		Student stu3 = new Student("park  ", 56   , 24, 75, 87,80); // ���� Person�̶�� Ŭ������ ���� => APIŬ���� ������ �Ȱ���

		Teacher t1 = new Teacher("�嵿��   ", 45   , "������");

		Staff e1 = new Staff("�輭��", 25   , "�����");

		stu1.print();
		stu2.print();
		stu3.print();
		t1.print();
		e1.print();

		/*
		 * System.out.println("Kim�� ��� :"+ stu1.getAvg() + "���� :"+stu1.getGrade());
		 * System.out.println("lee�� ��� :" + stu2.getAvg()+ "���� :"+stu2.getGrade());
		 * System.out.println("park�� ��� :" + stu3.getAvg()+ "���� :"+stu3.getGrade());
		 */

	}
}
