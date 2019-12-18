package oop.chap6.constructor;

public class MyConstructorTest {
	public static void main(String[] args) {

		// �⺻�����ڸ� ȣ���ؼ� ��ü�������� �� setter�޼ҵ带 �̿��ؼ� �� �ʱ�ȭ�ϱ�
		MyConstructor obj = new MyConstructor();

		obj.setName("�嵿��");
		obj.setId("jang");
		obj.setPass("1234");
		// �ʱ�ȭ�� ��Ų��.

		System.out.println(obj.getName() + "," + obj.getId() + "," + obj.getPass());
		// �Ű������� �ִ¤� ������ �żҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�

		// MyConstructor(String,String,String)
		MyConstructor obj2 = new MyConstructor("����", "bin", "4421"); // �Ű������� ������ �ٸ����Ͽ� ���� �����ȴ��� �ٽ� ���°�
		System.out.println(obj2.getName() + "," + obj2.getId() + "," + obj2.getPass());

		MyConstructor obj3 = new MyConstructor("����", "bin", "4421", "¯"); // �Ű������� ������ �ٸ����Ͽ� ���� �����ȴ��� �ٽ� ���°�
		System.out.println(obj3.getName() + "," + obj3.getId() + "," +
		obj3.getPass() + obj3.getNickname());

		
		MyConstructor obj4 = new MyConstructor("����", "bin", "4421", "¯","��⵵"); // �Ű������� ������ �ٸ����Ͽ� ���� �����ȴ��� �ٽ� ���°�
		System.out.println(obj4.getName() + "," + obj4.getId() + "," +
		obj4.getPass() + ","+obj4.getNickname() + ","+obj4.getAddr());
		
		
		MyConstructor obj5 = new MyConstructor("����", "bin", "4421", "¯","��⵵",4); // �Ű������� ������ �ٸ����Ͽ� ���� �����ȴ��� �ٽ� ���°�
		System.out.println(obj5.getName() + "," + obj5.getId() + "," +
		obj5.getPass() + ","+obj5.getNickname() + ","+obj5.getAddr()+ ","+obj5.getPoint());
		
		
	}
}

/*
 * 
 * ������ [��Ģ] 1.������ �޼ҵ���� Ŭ�������� ��ҹ��� ���� ��Ȯ�ϱ� ������ �̸����� �����ؾ��Ѵ�. => 2. ������ �޼ҵ带 ��������
 * ������ �����Ϸ��� �⺻�����ڸ� �����Ѵ� => �⺻������ : �Ű������� ���� ������ => ������ �޼ҵ带 �����ڰ� �����ϸ� �����Ϸ���
 * �⺻�����ڸ� �������� �ʴ´�. => ó���Ǵ� ���� ���ٰ� �ϴ��� ������ �⺻�����ڴ� �����ؾ� �Ѵ�. << �̰��߿�
 * 
 * 3. ������ �޼ҵ嵵 �Ϲ� �޼ҵ� ó�� �Ű������� �����ϰ� �ܺο��� ���� ���޹޾� ����� �� �ִ�. =>�ַ� ��ü�� ���ǵ� ��������� ����
 * �ʱ�ȭ�ϴ� �۾� 4. ������ �żҵ嵵 �Ϲ� �޼ҵ� ó�� �����ε��� ����Ѵ�. 5. ������ �޼ҵ� ���ο��� �ٸ� �������� �޼ҵ带 ȣ���� ��
 * �ִ�. =>this(�Ű�����...) => �ݵ�� ù ��° ���忡�� ȣ���ؾ� �Ѵ�.
 * 
 */