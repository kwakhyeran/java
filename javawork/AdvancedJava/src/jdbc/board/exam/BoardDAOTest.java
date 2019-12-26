package jdbc.board.exam;

import java.util.Scanner;

import jdbc.basic.PreparedInsertTest;

public class BoardDAOTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("============게시글 등록하기============");
		System.out.println("아이디 : ");
		String id = key.next();
		System.out.println("제목 : ");
		String title = key.next();
		System.out.println("내용: ");
		String content = key.next();
		obj.insert(id,title, content);
	}

}


