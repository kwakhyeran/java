package chap04;

public class SwitchTest03 {

	public static void main(String[] args) {
		// switch�� ���ǹ��� int�� casting�� �� �ִ� ���� ��� �ִ� ����, �����, �޼ҵ�
		double d = 1.5;
		/*
		 * switch(d){ }
		 */

		int data = 5;
		switch (data + 60) {
		case 'A': // '����' �ϸ� �ڵ���ȯ �ȿ� �ƽ�Ű �ڵ尡 ����
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
			break;
		}
		// String�� ����
		String code = new String("a01");
		switch (code) {
		case "a01":
			System.out.println("A01");
			break;
		case "a02":
			System.out.println("A02");
			break;
		}
	}
}
