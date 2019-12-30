package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//tb_board테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board){
		System.out.println("dto사용메소드 : "+board);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0;//메소드 실행 결과가 저장될 변수
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2,board.getTitle());
			stmt.setString(3, board.getContent());
			result = stmt.executeUpdate();
			System.out.println("삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int insert(String id, String title, String content){
		
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0;//메소드 실행 결과가 저장될 변수
		try {
			con = DBUtil.getConnect();//DBMS연결
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			result = stmt.executeUpdate();
			System.out.println("삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(String id,int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//수정결과를 저장할 변수
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board set id = ? ");
		sql.append("where boardNum=?");
		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			result = stmt.executeUpdate();
			System.out.println("삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
		}
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("Delete tb_board  ");
		sql.append("where boardnum=?");
		try {
			System.out.println("드라이버로딩 성공!!");
			con = DBUtil.getConnect();
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			result = stmt.executeUpdate();
			//실행하기
			System.out.println("삭제성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);		
		}
		return result;
	}
	//조회한 결과를 arraylist로 변환하여 리턴
	public ArrayList<BoardDTO> Select() {
		//전체 게시글을 담을 Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//조회한 게시글을 담을 객체.
		//객체를 생성하지 않고 null로 초기화하는 이유
		//-> 데이터를 조회하는 작업을 하는 곳이 while문 내부이므로
		//   while문에서 객체를 생성
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=> 레코드를 조회하기 위해서는
							  //   래코드가 한 개라도 반드시 커서를 이동시켜야 한다.
				//1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getDate(5), rs.getInt(6));
				//2. DTO로 변환된 레코드를 ArrayList에 추가
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	}
	@Override
	public BoardDTO read(int boardnum) {
		BoardDTO board = null;
		String sql = "select * from tb_board where boardnum=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			rs = stmt.executeQuery();
			while(rs.next()) {
				board =  new BoardDTO(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getDate(5),rs.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return board;
	}
	public ArrayList<BoardDTO> findByTitle(String Title) {
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from tb_board  ");
		sql.append("where Title like ?");
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, "%"+Title+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getDate(5), rs.getInt(6));
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
	
	}
}
