package chap03;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻�� ����
		int i = 10;
		int j = 10;
		System.out.println("===========�⺻��==========");
		if(i==j) {
			System.out.println("�⺻������.");
		}else {
			System.out.println("�⺻�� �ٸ���.");
		
		}
		//������ ����
	
		String str1 = new String("java");
		String str2 = new String("java");
		if(str1 == str2) {
			System.out.println("����������.");
		}else {
			System.out.println("�������ٸ���.");
		}
		
		//���ڿ���- StringŬ���� �޼ҵ�� ó��
		
		if(str1.equals(str2)) {              //equals�� 2���� ���ڿ��� ��
			System.out.println("���ڿ�����");
		}else {
			System.out.println("���ڿ� �ٸ���");
		}
		}
		
		
	}


