package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//2번 boardnum의 id를 kang으로 수정
//[출력형태]
//1개 행이 수정됐습니다.
public class PreparedUpdateTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		System.out.println("아이디 : ");
		String id = key.next();
		System.out.println("boardnum : ");
		String boardnum1= key.next();
		int boardnum = Integer.parseInt(boardnum1);
		obj.update(id,boardnum);
	}
		public void update(String id,int boardnum) {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = null;
			PreparedStatement stmt = null;
			StringBuffer sql = new StringBuffer();
			sql.append("update tb_board set id = ? ");
			sql.append("where boardnum=?");
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩 성공!!");
				con = DriverManager.getConnection(url, user, password);
				System.out.println("연결성공:"+con);
				stmt = con.prepareStatement(sql.toString());
				stmt.setString(1, id);
				stmt.setInt(2, boardnum);
				int result = stmt.executeUpdate();
				System.out.println("삽입성공");

			}catch(ClassNotFoundException e) {
				System.out.println("드라이버로딩 실패");
			}catch(SQLException e) {
				System.out.println("연결실패:"+e.getMessage());			
			}finally {
				try {
					if(stmt!=null)stmt.close();
					if(con!=null)con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
					
				}
			}
}



