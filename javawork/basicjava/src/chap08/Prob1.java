package chap08;
import java.util.Scanner;
public class Prob1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		
		String str= scan.nextLine();
		
		int result= 0;
	
		try {
				
		}catch(Exception e){	
		
		}
	}
		
	private static int convert(String str) {
		if(str==null||str.length()==0) {
			throw new IllegalArgumentException("예외가 발생되었습니다 . 문자열을 입력하지 않고 "
					+ "enter 키를 누르셨습니다");
		}
		
		System.out.println("변환된 숫자는"+  +"입니다.");
		return 0;
		


	}
}