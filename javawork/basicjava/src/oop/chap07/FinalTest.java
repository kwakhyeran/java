package oop.chap07;
class FinalSuper{
	public void display() {
		System.out.println("super display");
	}
}

class FinalSub extends FinalSuper{
	
	static final int NUM = 100;
	@Override
	public void display() {                       //final �޼ҵ�� �������̵� �Ҽ� ����.
		// TODO Auto-generated method stub
		System.out.println(" display");
	}

}

public class FinalTest {
	public static void main(String[] args) {
		
		FinalSub obj = new FinalSub();
		//obj.NUM=1000;						//����̹Ƿ� ���� ������ �� ����.
		
		System.out.println(FinalSub.NUM);
	}

}
