package jdbc.board.exam;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		for(int i =0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getId()+
					"\t"+board.getTitle()+"\t"+board.getHit());
		}
		
	}
	public void selectMenu() {
		System.out.println("*******게시글조회********");
		ArrayList<BoardDTO> boardlist = dao.Select();
		int size = boardlist.size();
		for(int i =0;i<size;i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum()+"\t"+board.getTitle()+"\t"+board.getId()+"\t"+board.getHit());
			
		}
	}
	
	public void readMenu() {
		System.out.println("*******게시글 상세보기********");
		System.out.println("글번호: ");
		int boardnum = key.nextInt();
		BoardDTO board = dao.read(boardnum);
		if(board==null) {
			System.out.println("조회된 데이터가 없습니다.");
		}else {
			System.out.println("글번호: "+board.getBoardNum());
			System.out.println("제목: "+board.getTitle());
			System.out.println("작성자: "+board.getId());
			System.out.println("내용: "+board.getContent());
			System.out.println("작성날짜: "+board.getWriteDate());
			System.out.println("조회수: "+board.getHit());
		}
		
		
	}
	
}


















