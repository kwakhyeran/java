package oop.chap07;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
	//API�� static �޼ҵ� �����ϱ�
	// => static����� �ν��Ͻ��� ������ �ƴϹǷ� ������ Ŭ���������� �����Ѵ�
	
		//static�޼ҵ�  - new�� ���� �ø��� �ʾƵ� static�� �̹� Ŭ������ �÷��� �ֱ� ������ �׳� ����Ѵ�.
		System.out.println(Math.PI);                    //�̰�쿡�� Math Ŭ������ ����� static�� �ø���
 		System.out.println(Math.random());
	 
		
		//non-static�޼ҵ�(�Ϲݸ޼ҽ�-�ν��Ͻ��޼ҵ�)  - new�� �÷� ������ �����ѵ� ����Ѵ�.
		//��ü������ �� �Ŀ� ���������� ���ؼ� ������
 		Random rand = new Random();
		System.out.println(rand.nextInt());	
	}
	
	

}
