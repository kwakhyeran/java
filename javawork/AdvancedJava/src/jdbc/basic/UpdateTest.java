package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//2번 boardnum의 id를 kang으로 수정
//[출력형태]
//1개 행이 수정됐습니다.
public class UpdateTest {
	public Update

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board set id = 'kang' ");
		sql.append("where boardnum=2");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			Connection con = 
					DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개 행 변경성공!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}

	}

}
