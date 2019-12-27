package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public void Select() {
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
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6)+"\t");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
	}
}
