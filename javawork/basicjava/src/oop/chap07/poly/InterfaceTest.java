package oop.chap07.poly;

import javax.swing.JFrame;
//�������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���, �⺻������ �����ؾ� �ϴ� ����� �������� �����ϱ� ���� ����
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		
		super(title);
		setSize(500,500);                                  //�̷��͵��� �θ�Ŭ������ ������ִ°�
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		GUITest obj = new GUITest("�������̽� ����");
	}

}