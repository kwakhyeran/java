package chap04;
//if문과 Random클래스 연습
import java.util.Random;

public class IfTest01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a = rand.nextInt(100)+1;
		

		System.out.println("랜덤숫자 =>"+a);
		
		if(a>=90) {	
		System.out.println("만족");
		}else {
			System.out.println("90미만의 숫자");	
			
		}
		}
	}