package chap04;

import java.util.Scanner;
//��ø if�� - if�� �ȿ� if�� �����ϰ� ����ϱ� (��� ����� ��ø�� �� �ִ�.)
public class IfTest03 {

	public static void main(String[] args) {
		//Scanner�� ������ �Է¹޾� 90���̻��ϸ� "���"�� ����ϰ�
		//90���̸��̸� "�����"�� ����ϼ���
		Scanner key = new Scanner(System.in);
		System.out.print("�������� : ");
		int jumsu = key.nextInt();
		
		System.out.print("����Ƚ�� : ");
		int count = key.nextInt();		//����Ƚ��
	
		if(jumsu >=90) {
			System.out.println("��� ");
		
		}else {
			if(count > 3) {
				System.out.println("ó������ �ٽý��� ");
			}else {
				System.out.println("�̰��� �����");	
			}
		
		}
		
	}

}//��������if�� �ȿ� ����Ƚ��if���� �־� ��ø������� ����
