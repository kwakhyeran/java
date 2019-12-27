package Test;

import java.util.Scanner;
public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******고객관리시스템********");
		System.out.println("1. 고객등록");
		System.out.println("2. 고객수정");
		System.out.println("3. 고객탈퇴");
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		CustomerUI ui = new CustomerUI();
		switch(choice){
			case 1:
				ui.insert();
				break;
			case 2:
				ui.update();
				break;
			case 3:
				ui.delete();
				break;
		}
	}
}













