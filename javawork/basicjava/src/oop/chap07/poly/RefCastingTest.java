package oop.chap07.poly;
//��ü�� ����ȯ

class Parent {
	String name = "�嵿��";

	public void display() {
		System.out.println("�θ��� display");
	}
}

class Child extends Parent {
	String name = "�̹�ȣ";

	public void display() {
		System.out.println("�ڽ��� display");
	}

	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");

	}
}

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� Super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display(); // �嵿�� ���
		System.out.println(obj1.name);
		System.out.println("************************");
		System.out.println("2. subŸ���� ���������� Sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		/*
		 * ��ü�� ����ȯ
		 */
		System.out.println("************************");
		System.out.println("3. superŸ���� ���������� Sub��ü�� ����");
		Parent obj3 = new Child(); // Parent���� obj3�̶�� ���������� Child���� ���Ӱ� ����
		obj3.display(); // �޼ҵ�:�������̵��� �޼ҵ尡 ȣ��
		System.out.println(obj3.name); // ���� : �������� Ÿ�Կ� �ش��ϴ�Ŭ������ ��������� ȣ��

		// Ÿ���� ParentŸ�������� ������ ������ ��ü�� ChildŸ���̱� ������
		// ChildŸ������ ����ȯ�� �����ϴ�.(������)
		((Child) obj3).test();

		System.out.println("************************");
		System.out.println("4. subŸ���� ���������� Super��ü�� ����----x");
		// Child obj4 = new Parent();

		System.out.println("************************");
		System.out.println("5. subŸ���� �������� = " + " superŸ���� ��������(Super��ü�� ����)");
		//���������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ����� ��������� ĳ������ �Ϸ��� �Ҷ� 
		//obj1�� Child������ ���� ���� �����Ƿ� ĳ���� ���ܹ߻�
		//Child obj5 = (Child)obj1;                  

		System.out.println("************************");
		System.out.println("6. subŸ���� �������� = " + " superŸ���� ��������(Super��ü�� ����)------o");
	
		
		Child obj6 = (Child)obj3;   		//obj3�� ĳ������ �ع���    obj3�� superŸ���̱� ������ 
									 		//���� Child�� �����ϰ� �ֱ⶧����.. ����ȯ�� ����
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
	}
}