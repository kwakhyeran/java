package chap03;  //chap03 ������ �����ϰ� �� �ȿ� APITest.class�� �����Ѵ�.

// java.lang��Ű���� �⺻���� �ν��ϹǷ�
import java.io.File;
import java.util.Random;

				 //�ٸ� ��Ű���� �����ϴ� Ŭ������ ����ϴ� ��� � ��Ű���� �ִ���
				 //�νĽ�Ű�� �۾��� �ؾ��Ѵ�
					//�̰� ioŬ���� ���� �νĽ�Ų��
//import java.util.*;//* �̰� ��� Ŭ���� �νĽ�Ű��
//API����ϱ� - ������ ��������


public class APITest {
	
	public static void main(String[] args) {
		//1.API���� �����ϴ� Ŭ������ �ڹ� ���α׷� �ȿ��� ����ϱ� ���� �޸𸮿�
		//	�ø��� �۾� - JVM�� �ν��ϴ� �۾� ������ �Ҵ�
		
		//����� �۷����� ���� = new ����� Ŭ������();
		//----------
		// Ÿ������ ���ȴ�.
		
		//new�� ����� �޸𸮿� ������ ��Ű�� 
		String str = new String();  //str������쿡�� �ƹ��ų� �ᵵ��
		StringBuffer sb = new StringBuffer();
		File file = new File("test.txt");
		Random rand = new Random();
		//ArrayList list = new ArrayList();
		
		//2. ��ü(Ŭ������ ����ϱ� ���� �޸𸮿� �÷� ������)�� �żҵ� ����ϱ�
		//		->�ν��Ͻ������
		String str2 = new String("java programming");
		char returnVal = str2.charAt(1); //charAt�� �������� charŸ���̹Ƿ�
		System.out.println("������=>"+returnVal); //���� Ÿ���� ������ �����ؼ� ����

		String str3 = new String("i love you");
		int returnVa2 = str3.length(); //method���� length..
		System.out.println("���ڿ� ����=>"+returnVa2); //���� Ÿ���� ������ �����ؼ� ����

		//String()�� 
	}

}