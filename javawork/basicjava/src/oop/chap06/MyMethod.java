package oop.chap06;

//�޼ҵ� �����ϴ� ������ ���� Ŭ����
public class MyMethod {

	//4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	//=> ���� 2���� �Ű������� ���޹޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	//   �żҵ� ����ο� ����Ÿ���� �����ϴ� ��� �ݵ�� �޼ҵ��� ���������� ���� return�ؾ��Ѵ�.
	public int add(int a, int b) {
		int sum = 0; 
		sum = a + b;
		return sum;
	}
	
	//3. ���ϰ��� ���� �Ű������� �ΰ��� �żҵ�
    // => ��±�ȣ, ����� Ƚ���� �Ű������� ���� �޾� ����� �� �ֵ���
	//	      �޼ҵ带 �����ϰ�, MyMethodTest.java ���� ȣ���ϱ�
	public void display(String a, int count) {
   
		for (int i = 1; i <= count; i++) {
			System.out.print(a);
		
		}
		System.out.println();

	}
	// 2. ���ϰ��� ���� �Ű������� �Ѱ��� �żҵ�
	public void display(String str) { //String Ÿ������ �����͸� �ް��ֱ� ������ ���� �Ѱ��ټ��ִ�.
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();

	}
	// 1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�

	public void display() {

		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void display(int data) {
		
	}
	
	public void display(String a, long count) {}
	

}
