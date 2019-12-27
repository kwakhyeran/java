package jdbc.board.exam;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		BoardDTO board = new BoardDTO(id, title, content);
		//여기에서 boardDAO의 메소드를 호출하세요
		int result = dao.insert(board);
		//결과처리
		if(result>0) {
			System.out.println("게시글 등록 성공!");
		}else {
			System.out.println("게시글 등록 실패ㅠ");
		}
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		int boardnum = key.nextInt();
		//여기에서 boardDAO의 메소드를 호출하세요
		int result = dao.update(id, boardnum);
		if(result>0) {
			System.out.println("게시글 수정 성공!");
		}else {
			System.out.println("게시글 수정 실패ㅠ");
		}
		
		
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		int boardnum = key.nextInt();
		//여기에서 boardDAO의 메소드를 호출하세요
		int result = dao.delete(boardnum);
		if(result>0) {
			System.out.println("게시글 삭제 성공!");
		}else {
			System.out.println("게시글 삭제 실패ㅠ");
		}
	}
	public void searchMenu(){
		System.out.println("*******게시글검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 boardDAO의 메소드를 호출하세요
		
	}
}


















