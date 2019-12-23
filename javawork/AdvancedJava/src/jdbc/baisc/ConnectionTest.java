package jdbc.baisc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
//local host = 127.0.0.1 = ���� �۾����� ��pc
	public static void main(String[] args) {
		//���Ṯ�ڿ� - � dbms�� �����Ŀ� ���� ������ �޶�����.
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "insert into tb_board values(board_seq.nextval,'jang','����','����',sysdate,0)";
		String sql1 = "insert into tb_board values(board_seq.nextval,'lando','����','����',sysdate,0)";
		String sql2 = "insert into tb_board values(board_seq.nextval,'carlos','����','����',sysdate,0)";
		String sql3 = "insert into tb_board values(board_seq.nextval,'charles','����','����',sysdate,1)";
		//���ݿ� �ִ� ���� DB ���� ip
		
		//String url = "jdbc:oracle:thin:@70.12.115.80:1512:xe";
		//���� ������ �н�����
		String user = "scott";
		String password = "tiger";
		try {
			// 1.����Ŭ ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����!!");
			//2.DBMS�� �����ϱ�- ���������� ����
			Connection con = 
					DriverManager.getConnection(url, user, password);
			
			DriverManager.getConnection(url, user, password);
			System.out.println("���� ���� : "+con);
			//3.sql �� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ� connection��ü�� �̿��ؼ� ����
			Statement stmt = con.createStatement();
			System.out.println("SQL�� �����ϱ� ���� ��ü ���� : "+stmt);
			//4.sql����
			
			stmt.executeUpdate(sql);
			System.out.println("���Լ���!!!");
			stmt.executeUpdate(sql1);
			System.out.println("���Լ���!!");
			stmt.executeUpdate(sql2);
			System.out.println("���Լ���!");
			stmt.executeUpdate(sql3);
			System.out.println("���Լ���");
			
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����!");
		}catch(SQLException e) {
			System.out.println("���� ����  : "+e.getMessage());
		}
	}

}
