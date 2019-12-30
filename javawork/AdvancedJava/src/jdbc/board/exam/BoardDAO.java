package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//게시글 등록-c
	int insert(String id, String title, String content);
	int update(String id,int boardNum);//게시글 수정-u
	int delete(int boardNum);//게시글 삭제-d
	//
	ArrayList<BoardDTO> Select();//전체 게시글 조회-L
	BoardDTO read(int boardnum);//게시글 조회 -R
	//read는 결과 하나밖에 없어서... boarddto로?
	ArrayList<BoardDTO> findByTitle(String title);//게시글 검색 -
	
			

}
