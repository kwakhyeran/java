package jdbc.board.exam;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
		BoardDTO board = new BoardDTO(id, title, content);
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.insert(board);
		//���ó��
		if(result>0) {
			System.out.println("�Խñ� ��� ����!");
		}else {
			System.out.println("�Խñ� ��� ���Ф�");
		}
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		int boardnum = key.nextInt();
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, boardnum);
		if(result>0) {
			System.out.println("�Խñ� ���� ����!");
		}else {
			System.out.println("�Խñ� ���� ���Ф�");
		}
		
		
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		int boardnum = key.nextInt();
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(boardnum);
		if(result>0) {
			System.out.println("�Խñ� ���� ����!");
		}else {
			System.out.println("�Խñ� ���� ���Ф�");
		}
	}
	public void searchMenu(){
		System.out.println("*******�Խñ۰˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� boardDAO�� �޼ҵ带 ȣ���ϼ���
		
	}
}


















