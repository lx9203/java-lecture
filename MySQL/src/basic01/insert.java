package basic01;

import java.sql.*;

public class insert {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass");

			String query = "insert into song(title, lyrics) values (?, ?);";

			PreparedStatement pStmt = conn.prepareStatement(query);
			pStmt.setString(1, "가시나");
			pStmt.setString(2, "선미");

			pStmt.executeUpdate();

			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}