package oop.chap07.poly;

/*�������̽� ����
 * <<�������̽�>>
 * 
 * =>�߻�޼ҵ�(����� ����)�� �����ϴ� Ư���� Ŭ����
 * 
 * 1.�������̽�ư interfaceŰ���带 �̿��ؼ� ����
 * 2.�������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 * 	-public abstract�� ��������
 * 	-����� ������ �ڵ����� �߰��ȴ�.
 * 3.�������̽��� �������̽��� ����Ҽ� �ִ�.(extends �̿�)
 * 4.Ŭ������ �������̽��� ����� �� �ִ�.
 * 	-�������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ�Ŭ������ ����ϴ� ��쿡 extends�� ���� �����ϰ� implements�� �����ؾ��Ѵ�
 * 
 * 5.�������̽��� �������� ����� �� �ִ�. ��, ���߻���� �����ϴ�.
 * 	implements �ڿ��� �������̽��� ������ ��   ,�� �����ؼ� ����
 * 
 * 6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽���
 *    ������ �νĵȴ�.(��ӹ޴� ��� Ŭ����, �������̽��� ����Ÿ���� �ȴ�.)
 *    
 *    
 */


interface InterA{
	public abstract void test(); 
		void display(int num);
		
}
interface InterB extends InterA{
	void show();
}

interface InterC{
	
}

class SuperA{
	
}

//SubA�� SuperA, InterB, InterC�� ����
class SubA extends SuperA implements InterB,InterC{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	} 
	
}

public class InterfaceTest01 {
	public static void main(String[] args) {
	SuperA obj1 = new SubA();
	InterA obj2 = new SubA();
	InterB obj3 = new SubA();
	InterC obj4 = new SubA();          //SubA�� ���� ���� �ڼ��̴�... �׷��� SuperA 
									   //��� �� 4���� �θ� �̿��� ���������� �����Ҽ��ִ�.
	
	
	}

}
