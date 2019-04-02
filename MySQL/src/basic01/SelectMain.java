package basic01;

import java.sql.*;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false", "javauser",
					"javapass");

			st = conn.createStatement();
			String sql = "select * from song where title like 'Gee';";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int songId = rs.getInt(1);
				String title = rs.getNString(2);
				String lyrics = rs.getNString(3);
				System.out.printf("%8d %-20s\t%s\n", songId, title, lyrics);
			}
			rs.close();
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
