package chap05;

public class ArgsTest {

	public static void main(String[] args) {
	/*
	 	args = new String[2]
	 			-----
	 			����� �Ű������� ������ŭ ����
	 	args[0] = "100"
		args[1] = "200"
	 */
		System.out.println("����� �Ű����� ->"+args[0]);
		System.out.println("����� �Ű����� ->"+args[1]);  //����� �Ű������� 2���ްڴٴ� �ǹ�
		
		for (int i = 0; i <args.length;i++) {
			
			System.out.println(args[i]);
		}

		System.out.println("�� - > "+args[0]+args[1]); //String�� �׳� ����ǥ���� ���� ������ �ȵȴ�. �׷��� 300�� �ƴ� 100200�� ��
		
		int num1 = Integer.parseInt(args[0]);       //String���� ���ǵ� 
		int num2 = Integer.parseInt(args[1]);		//args�� int������ ��ȯ�ϴ� ����
		System.out.println("�� - > "+(num1 + num2));  // int ������ ��ȯ�� args ���� ���ϸ� 300�� ���´�.
		
	}


}
