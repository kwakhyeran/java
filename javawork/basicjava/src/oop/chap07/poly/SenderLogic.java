package oop.chap07.poly;

public class SenderLogic {
	public void run(Sender obj) {
		// Sender클래스의 클래스들을 활용하는 메소드 
		//부모타입의 변수로 매개변수로 선언하면 그자손(sms,email)들을 다 받을수있다.
		
		System.out.println("실행완료");

		obj.print();

	}
}
