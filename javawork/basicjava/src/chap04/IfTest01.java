package chap04;
//if���� RandomŬ���� ����
import java.util.Random;

public class IfTest01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int a = rand.nextInt(100)+1;
		

		System.out.println("�������� =>"+a);
		
		if(a>=90) {	
		System.out.println("����");
		}else {
			System.out.println("90�̸��� ����");	
			
		}
		}
	}