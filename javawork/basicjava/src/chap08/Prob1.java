package chap08;
import java.util.Scanner;
public class Prob1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		
		String str= scan.nextLine();
		
		int result= 0;
	
		try {
				
		}catch(Exception e){	
		
		}
	}
		
	private static int convert(String str) {
		if(str==null||str.length()==0) {
			throw new IllegalArgumentException("���ܰ� �߻��Ǿ����ϴ� . ���ڿ��� �Է����� �ʰ� "
					+ "enter Ű�� �����̽��ϴ�");
		}
		
		System.out.println("��ȯ�� ���ڴ�"+  +"�Դϴ�.");
		return 0;
		


	}
}