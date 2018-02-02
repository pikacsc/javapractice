import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMysql {

	public static void main(String[] args) {
		Connection conn = null; // ¿¬°á°´Ã¼
		Statement stmt = null;
		ResultSet rs = null;
		
		String id ="root";
		String pw ="1234";
		String url;
		
		url = "jdbc:mysql://localhost:3306/sampledb";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,id,pw);
			
			System.out.println("¿¬°áµÊ");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from test");
			
			while(rs.next()) {
				String sid = rs.getString(1);
				String name = rs.getString(2);
				System.out.println(sid);
				System.out.println(name);
			}
			
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
