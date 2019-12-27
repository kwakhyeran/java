package Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.board.exam.DBUtil;

public class CustomerDAO{
	public int insert(CustomerDTO customer) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into customer values(?,?,?,sysdate,1000,?)";
		int result =0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.getId());
			stmt.setString(2, customer.getPass());
			stmt.setString(3, customer.getName());
			stmt.setString(4, customer.getAddr());
			result = stmt.executeUpdate();
			System.out.println("삽입성공!!");
		}catch(SQLException e) {
			System.out.println("삽입 실패ㅠㅠ");
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int update(String id,String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("update customer set addr = ? ");
		sql.append("where id=?");
		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, addr);
			stmt.setString(2, id);
			result = stmt.executeUpdate();
			System.out.println("삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());			
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
		}
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("Delete customer  ");
		sql.append("where id=?");
		try {
			System.out.println("드라이버로딩 성공!!");
			con = DBUtil.getConnect();
			System.out.println("연결성공:"+con);
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
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
	
}
