package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//tb_board���̺��� �������ϴ� ����� ���ǵ� Ŭ����
public class BoardDAOImpl implements BoardDAO{
	public int insert(BoardDTO board){
		System.out.println("dto���޼ҵ� : "+board);
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0;//�޼ҵ� ���� ����� ����� ����
		try {
			con = DBUtil.getConnect();//DBMS����
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, board.getId());
			stmt.setString(2,board.getTitle());
			stmt.setString(3, board.getContent());
			result = stmt.executeUpdate();
			System.out.println("���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int insert(String id, String title, String content){
		
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0;//�޼ҵ� ���� ����� ����� ����
		try {
			con = DBUtil.getConnect();//DBMS����
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			result = stmt.executeUpdate();
			System.out.println("���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(String id,int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//��������� ������ ����
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board set id = ? ");
		sql.append("where boardNum=?");
		try {
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			result = stmt.executeUpdate();
			System.out.println("���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
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
			System.out.println("����̹��ε� ����!!");
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
			result = stmt.executeUpdate();
			//�����ϱ�
			System.out.println("��������");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);		
		}
		return result;
	}
	//��ȸ�� ����� arraylist�� ��ȯ�Ͽ� ����
	public ArrayList<BoardDTO> Select() {
		//��ü �Խñ��� ���� Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//��ȸ�� �Խñ��� ���� ��ü.
		//��ü�� �������� �ʰ� null�� �ʱ�ȭ�ϴ� ����
		//-> �����͸� ��ȸ�ϴ� �۾��� �ϴ� ���� while�� �����̹Ƿ�
		//   while������ ��ü�� ����
		BoardDTO board = null;
		String sql = "select * from tb_board";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			//select���� ���� 
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=> ���ڵ带 ��ȸ�ϱ� ���ؼ���
							  //   ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getDate(5), rs.getInt(6));
				//2. DTO�� ��ȯ�� ���ڵ带 ArrayList�� �߰�
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
			//select���� ���� 
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
			//select���� ���� 
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
