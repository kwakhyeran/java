package oop.chap07;
/*<<�������迡�� �����ڰ� ���� Ư¡>>
 *1. Ŭ������ ��� �����ڸ޼ҵ��� ù ��° ���忡�� �θ�Ŭ������ �⺻�����ڸ� ȣ���ϴ� ���ɹ��� �����Ǿ� �ִ�.
 * =>�θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �� �����Ƿ�
 * =>�θ��� �����ڸ� ȣ���ϴ� ����� super(...) super()�� �θ��� �Ű����� ���� �⺻������
 * =>�̹� �ٸ� �����ڸ� ȣ���ϴ� ��� super()�� �� �� ����.
 * this()�� ȣ���ϴ� ��� super()�� ȣ���Ҽ� ����.
 * 2. ��� Ŭ������ �ֻ���Ŭ������ java.lang.ObjectŬ����
 *  => �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������ ��ӹް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����Ѵ�.
 *  �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ϴ� ��쿡�� ����Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
 *  3. �θ�Ŭ������ ���ǵǾ��ִ� ��������� ���� �����ؾ� �ϴ� ��쿡�� ����Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
 *   	super(��1,��2...)
*/

class SuperA extends java.lang.Object {
  String name;
	 int age;

	SuperA() {
		super();
	}

	SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class SubA extends SuperA {
	String addr;
	int point;

	SubA() {
		super();
	}

	SubA(String addr) {

		super();
		this.addr = addr;
	}

	SubA(String addr, int point) {
		// super();
		this(addr); // �̹� ���ǵǾ��ִ� �� �ٸ� �����ڸ� ȣ��
		this.point = point;
	}

	SubA(String name, int age, String addr, int point) {
		super(name, age);	// �θ��� �Ű����� 2�� �����ڸ� ȣ��        this. �ȵǴ°��..
							//super(String,int)
		this.addr = addr;
		this.point = point;
	}
}

public class InheritanceTest03 {
	public static void main(String[] args) {
		SubA obj = new SubA("�����", 45, "�����", 1000);
		System.out.println(obj.name + "," + obj.addr + "," + obj.age + "," + obj.point);
	}
}