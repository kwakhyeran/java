package oop.chap06;
//MyMethod Ŭ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public abstract class MyMethodTest {
	public static void main(String[] args) {

		System.out.println("********���α׷� ����*********");

	MyMethod m =new MyMethod();
	//1. 
	m.display();


	System.out.println("=====================================");
	//2. �Ű����� �Ѱ�, ���ϰ��� ���� �żҵ��� ȣ��
	m.display("*");               
	m.display("��");
	m.display("��");

	System.out.println("=====================================");
	//3. �Ű����� 2��
	m.display("Lee\t" ,5);     //display(String__, int__);
	m.display("*",10);               
	m.display("��",20);
	m.display("��",30);
	

	// �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
	// �޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ���
	//�� ���ϰ��� ������ Ÿ���� ������ �����ؼ� �������־���Ѵ�.
	//�� �ٸ� �޼ҵ��� �Ű������� ������ �� �ִ�.
	int sum = m.add(100,200);
	System.out.println("�޼ҵ� ȣ�� ��� =>"+sum);        //1��

	System.out.println("�޼ҵ� ȣ�� ��� =>"+m.add(100,200)); //2��
	
	System.out.println("********���α׷� ����*********");
	
	}
	
}
