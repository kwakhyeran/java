package jdbc.baisc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("�ε� ����!!!");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ���� : "+con);
			DriverManager.getConnection(url, user, password);
			
		}catch(ClassNotFoundException e) {
			System.out.println("�ε� ����!");
			
		}catch(SQLException e) {
			System.out.println("���� ����  : "+e.getMessage());
		}
	}

}