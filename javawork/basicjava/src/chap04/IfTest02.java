package chap04;

import java.util.Scanner;
//if~else���� Scanner
public class IfTest02 {

	public static void main(String[] args) {
		//Scanner�� ������ �Է¹޾� 90���̻��ϸ� "���"�� ����ϰ�
		//90���̸��̸� "�����"�� ����ϼ���
		Scanner key = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int jumsu = key.nextInt();
		
		if(jumsu >=90) {
			System.out.print("��� ");
		}else {
			System.out.print("�����"); // print�� println ������ = �Է��� 
									  	//������ �ϳ� ���������� �ϳ� ����
		}
		
	}

}