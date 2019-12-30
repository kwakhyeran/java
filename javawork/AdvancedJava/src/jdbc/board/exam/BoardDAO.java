package jdbc.board.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//�Խñ� ���-c
	int insert(String id, String title, String content);
	int update(String id,int boardNum);//�Խñ� ����-u
	int delete(int boardNum);//�Խñ� ����-d
	//
	ArrayList<BoardDTO> Select();//��ü �Խñ� ��ȸ-L
	BoardDTO read(int boardnum);//�Խñ� ��ȸ -R
	//read�� ��� �ϳ��ۿ� ���... boarddto��?
	ArrayList<BoardDTO> findByTitle(String title);//�Խñ� �˻� -
	
			

}
