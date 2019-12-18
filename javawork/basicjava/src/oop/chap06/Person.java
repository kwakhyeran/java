package oop.chap06;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null, ������ 0, �Ǽ��� 0.0, boolean�� false
// - ��������� �����Ҷ� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
//   public
//   default
//   protected
//   private
//Ŭ������ �����Ҷ� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
//public�޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
public class Person { //person �̶�� Ŭ�󽺸� ���� : �λ���� �ý���
	
	private String name; //���ڿ� - String                   //Ŭ������ Ư��(�̸� �ּ� ����)�� ��Ÿ���� ������ 
	private String addr; //���� + ���� - String					   // - �������
	private int age; //���� - int

	//name�� public -> ���� ������ ���� = �ٰ���
	//addr�� default -> ���� ��Ű���� ����
	//age�� private -> ���� Ŭ������ ����               //�̸� ��� private���� �����ϸ� ���� Ŭ���������� ����
	
	//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� ������ �޼ҵ�� ���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	
	//name������ ���� �����ϴ� �޼ҵ�(set�� ���ϰ��� void)
	//�޼ҵ�� : set + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	// 			setName
	
	public Person(String name, String addr, int age) { // �̰� �������-> test�� �嵿��� ����� ����
		//System.out.println("�Ű����� 3�� ������");	// �ɹ�����(�ν��Ͻ�����, ��ü����)�� �ʱ�ȭ
		this.name = name;
		this.addr = addr;
		this.age = age;
		
	}

	
	public void setName(String name) {  //setter�޼ҵ�
		this.name = name;
	}
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ�� : get + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//		 getName
	public String getName() {
		return this.name;
	}

	public void setAddr(String addr) {  
		this.addr = addr;
	
	}
	public String getAddr() {
		return this.addr;
	}

	public void setAge(int age) {  
		this.age = age;
	
	}
	public int getAge(){
		return this.age;
	}
}