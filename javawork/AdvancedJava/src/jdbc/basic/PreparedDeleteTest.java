package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//2번 boardnum의 id를 kang으로 수정
//[출력형태]
//1개 행이 수정됐습니다.
public class PreparedDeleteTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedDeleteTest obj = new PreparedDeleteTest();
		System.out.println("boardnum : ");
		int boardnum = key.nextInt();
		obj.delete(boardnum);
		
	}
		public void delete(int boardnum) {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = null;
			PreparedStatement stmt = null;
			StringBuffer sql = new StringBuffer();
			sql.append("Delete tb_board  ");
			sql.append("where boardnum=?");
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버로딩 성공!!");
			
				con = DriverManager.getConnection(url, user, password);
				System.out.println("연결성공:"+con);
				stmt = con.prepareStatement(sql.toString());
				stmt.setInt(1, boardnum);
				int result = stmt.executeUpdate();
				//실행하기
				System.out.println("삭제성공");
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

