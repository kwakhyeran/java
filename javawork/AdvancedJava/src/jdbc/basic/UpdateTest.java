package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//2�� boardnum�� id�� kang���� ����
//[�������]
//1�� ���� �����ƽ��ϴ�.
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
			System.out.println("����̹� �ε� ����!");
			Connection con = 
					DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"�� �� ���漺��!");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		}catch(SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}

	}

}
