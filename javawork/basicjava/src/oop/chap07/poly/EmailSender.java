package oop.chap07.poly;
public class EmailSender extends Sender {  //자식클래스
	int length;
	
	public EmailSender(String name,int length){
		super(name);                    //부모로부터 상속받는다.
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void print() {
		//EmailSender에서만 처리되는 고유의 기능을 실행
		System.out.println(name+"("+length+")로 전송했습니다.");
	}
}

