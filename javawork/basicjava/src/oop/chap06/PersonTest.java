package oop.chap06;
//Person Ŭ������ ����ϴ� Ŭ����
public class PersonTest {

	public static void main(String[] args) {
	
		Person p1 = new Person("������","�Ȼ�",27);     //���� Person�̶�� Ŭ������ ���� => APIŬ���� ������ �Ȱ���
				
		System.out.println("���� :" + p1.getName()); //get�۾�
		System.out.println("�ּ� :" + p1.getAddr());
		System.out.println("���� :" + p1.getAge());
		
		Person p2 = new Person("������","����",28);     //���� Person�̶�� Ŭ������ ���� => APIŬ���� ������ �Ȱ���
			
		System.out.println("���� :" + p2.getName());
		System.out.println("�ּ� :" + p2.getAddr());
		System.out.println("���� :" + p2.getAge());
	
	}
}