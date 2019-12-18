package chap08;
//try ~ catch
public class ExceptionTest02 {

	public static void main(String[] args) {

		try {
			System.out.println("*******프로그램 시작*******");
			System.out.println(10 / 0);
			System.out.println("*******프로그램 종료*******");

		} catch (ArithmeticException e) {
			System.out.println("오류발생.....");
			System.out.println("예외메시지 :"+e.getMessage());  //getMessage()는 예외메시지
			e.printStackTrace();							 //void, 오류를 추적하는 메소드
		}
	}

}
