package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//tb_board���̺��� �������ϴ� ����� ���ǵ� Ŭ����
public class BoardDAO {
	public void insert(String id, String title, String content){
		
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();//DBMS����
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			int result = stmt.executeUpdate();
			System.out.println("���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	public void update(String id,int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board set id = ? ");
		sql.append("where boardnum=?");
		try {
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
			stmt.setInt(2, boardnum);
			int result = stmt.executeUpdate();
			System.out.println("���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
	public void delete(int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("Delete tb_board  ");
		sql.append("where boardnum=?");
		try {
			System.out.println("����̹��ε� ����!!");
			con = DBUtil.getConnect();
			System.out.println("���Ἲ��:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardnum);
			int result = stmt.executeUpdate();
			//�����ϱ�
			System.out.println("��������");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());			
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
				
		}
	}
	public void Select() {
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
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
				if(rs!=null)rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
