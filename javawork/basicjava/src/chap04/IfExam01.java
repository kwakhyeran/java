package chap04;

import java.util.Scanner;

//���ڸ� �޾Ƽ� ��� or ���� ����ϰ�, �� ����ΰ�� ¦������ Ȧ������ ����ϱ�

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner key =new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int score = key.nextInt(); // nextInt�� �������� ���ڸ� �޴°�
		
		if(score >= 0) {
			if((score%2)==0) {
				System.out.println("¦���Դϴ�");
			}else{
				System.out.println("Ȧ���Դϴ�");
			}
		}else {
			System.out.println(score+"�� �����Դϴ�");
		}
	}
}