package chap08;
//try ~ catch
public class ExceptionTest02 {

	public static void main(String[] args) {

		try {
			System.out.println("*******���α׷� ����*******");
			System.out.println(10 / 0);
			System.out.println("*******���α׷� ����*******");

		} catch (ArithmeticException e) {
			System.out.println("�����߻�.....");
			System.out.println("���ܸ޽��� :"+e.getMessage());  //getMessage()�� ���ܸ޽���
			e.printStackTrace();							 //void, ������ �����ϴ� �޼ҵ�
		}
	}

}
