package Test;

import java.util.Scanner;
public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�������ý���********");
		System.out.println("1. �����");
		System.out.println("2. ������");
		System.out.println("3. ��Ż��");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
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













