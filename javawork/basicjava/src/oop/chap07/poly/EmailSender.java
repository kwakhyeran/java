package oop.chap07.poly;
public class EmailSender extends Sender {  //�ڽ�Ŭ����
	int length;
	
	public EmailSender(String name,int length){
		super(name);                    //�θ�κ��� ��ӹ޴´�.
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//EmailSender������ ó���Ǵ� ������ ����� ����
		System.out.println(name+"("+length+")�� �����߽��ϴ�.");
	}
}

