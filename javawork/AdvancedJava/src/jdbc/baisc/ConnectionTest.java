package jdbc.baisc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
//local host = 127.0.0.1 = 현재 작업중인 내pc
	public static void main(String[] args) {
		//연결문자열 - 어떤 dbms를 쓰느냐에 따라 형식이 달라진다.
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "insert into tb_board values(board_seq.nextval,'jang','연습','연습',sysdate,0)";
		String sql1 = "insert into tb_board values(board_seq.nextval,'lando','연습','연습',sysdate,0)";
		String sql2 = "insert into tb_board values(board_seq.nextval,'carlos','연습','연습',sysdate,0)";
		String sql3 = "insert into tb_board values(board_seq.nextval,'charles','연습','연습',sysdate,1)";
		//원격에 있는 실제 DB 서버 ip
		
		//String url = "jdbc:oracle:thin:@70.12.115.80:1512:xe";
		//접속 계정과 패스워드
		String user = "scott";
		String password = "tiger";
		try {
			// 1.오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공!!");
			//2.DBMS에 연결하기- 연결정보를 정의
			Connection con = 
					DriverManager.getConnection(url, user, password);
			
			DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공 : "+con);
			//3.sql 을 실행하기 위한 객체를 생성 - 연결정보와 연결시켜야 하므로 connection객체를 이용해서 생성
			Statement stmt = con.createStatement();
			System.out.println("SQL을 실행하기 위한 객체 정보 : "+stmt);
			//4.sql실행
			
			stmt.executeUpdate(sql);
			System.out.println("삽입성공!!!");
			stmt.executeUpdate(sql1);
			System.out.println("삽입성공!!");
			stmt.executeUpdate(sql2);
			System.out.println("삽입성공!");
			stmt.executeUpdate(sql3);
			System.out.println("삽입성공");
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
		}catch(SQLException e) {
			System.out.println("연결 실패  : "+e.getMessage());
		}
	}

}
