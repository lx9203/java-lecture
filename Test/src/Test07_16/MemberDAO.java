package Test07_16;

import java.sql.*;

public class MemberDAO {
	public static final int ID_PASSWORD_MATCH = 1;
	public static final int ID_DOES_NOT_EXIST = 2;
	public static final int PASSWORD_IS_WRONG = 3;
	public static final int DATABASE_ERROR = -1;

	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public MemberDAO() { // MySQL Connect
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	

	public void check(int id, String password) {
		boolean c = false;
		String query = "select * from Member;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				if (id == rs.getInt("id")) {
					if (password.equals(rs.getString("password"))) {
						c = true;
						break;
					}
				}
			}
			if (c)
				System.out.println("로그인되었습니다.");
			else
				System.out.println("로그인 실패");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
}
