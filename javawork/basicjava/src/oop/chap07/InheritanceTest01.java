package oop.chap07;
/*
 * �� <<��Ӱ��迡�� ��������� ���� Ư¡>>
 * 1. ��Ӱ��迡���� ����Ŭ������ ���ǵ� ��������� ����Ŭ�������� ����Ҽ� �Ӥ�����.
 * 2. ����Ŭ������ ������ ������ �̸��� ������ ����Ŭ������ �����ϴ� ��� ����Ŭ���� ��� ������ �켱������ �� ����.
 *3.�θ�Ŭ������ ������ �������Ϸ��� super�� �̿��ؼ� �����Ѵ�.
 *	this ->�ڱ��ڽ��� ��ü
 *	super ->�θ� ��ü
 *	4. ����Ŭ������  private���� ����� ������ ��Ӱ��迡 �ִٰ� �ϴ��� ���� Ŭ�������� ������ �� ����.
 */



class Super {
	private int num = 100;
}

class Sub extends Super { // Ŭ����
	public void display() { // �żҵ�
		int num = 1000;
		System.out.println("num=>" + num);
		System.out.println("�θ���  num=>" + super.num);

	
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		// ����Ŭ������ ���� Ŭ������ �Ϲ����� ������ �����ϱ� ���ؼ� ����ϴ� Ŭ�����̹Ƿ� �ַ� ����Ŭ������ �����ؼ� ����Ѵ�.
		Sub obj = new Sub();      //���� obj�� �����
		obj.display(); // ����Ŭ������ �޼ҵ带 ���
		System.out.println("main=>" + obj.num);
		
	}
}
