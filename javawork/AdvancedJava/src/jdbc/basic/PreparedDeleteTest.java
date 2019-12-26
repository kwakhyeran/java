package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//2�� boardnum�� id�� kang���� ����
//[�������]
//1�� ���� �����ƽ��ϴ�.
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
				System.out.println("����̹��ε� ����!!");
			
				con = DriverManager.getConnection(url, user, password);
				System.out.println("���Ἲ��:"+con);
				stmt = con.prepareStatement(sql.toString());
				stmt.setInt(1, boardnum);
				int result = stmt.executeUpdate();
				//�����ϱ�
				System.out.println("��������");
			}catch(ClassNotFoundException e) {
				System.out.println("����̹��ε� ����");
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
}

