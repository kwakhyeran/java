package chap04;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner key = new Scanner(System.in);
		
		do {
			
			System.out.println("���� �Է� : ");
			num=key.nextInt();
			System.out.println(+num);
			
		}while(num>10);
		
	}

}
