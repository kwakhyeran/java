package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedInsertTest;

public class BoardDAOTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("============�Խñ� ����ϱ�============");
		System.out.println("���̵� : ");
		String id = key.next();
		System.out.println("���� : ");
		String title = key.next();
		System.out.println("����: ");
		String content = key.next();
		obj.insert(id,title, content);
	}

}


