package oop.chap07.poly;
/*
 * ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 * instanceof�����ڸ� �̿�
 * 
 */

interface IA {

}

public class InstanceOfTest {
	public static void main(String[] args) {
	
		SubA obj = new SubA();
		
		//obj�� SuperAŸ���̶�� if���� �����ض�
		//-------------------------
		//SuperA�� ������ ?
		if(obj instanceof SuperA){
			System.out.println("SuperAŸ���̴�.");               //obj�� SubA�� ������ ������ �� �θ��� SuperAŸ�Կ� ���Ѵ�.
			}else {
				System.out.println("SuperAŸ�Ծƴϴ�");
						
			}
	}

}
