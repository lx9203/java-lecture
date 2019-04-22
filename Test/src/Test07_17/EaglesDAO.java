package Test07_17;

import java.sql.*;
import java.util.*;

public class EaglesDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public EaglesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public EaglesDTO selectOne(int no) {
		String query = "select * from Eagles where no=?;";
		PreparedStatement pStmt = null;
		EaglesDTO eagles = new EaglesDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, no);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				eagles.setNo(rs.getInt("no"));
				eagles.setName(rs.getString("name"));
				eagles.setPosit(rs.getString("posit"));
				eagles.setHs(rs.getString("high_school"));
				eagles.setHand(rs.getString("hand"));
				eagles.setNickname(rs.getString("nickname"));
				eagles.setBackNo(rs.getInt("back_No"));
				eagles.setBirth(rs.getString("birth"));
				eagles.setSalary(rs.getInt("salary"));
			}
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
		return eagles;
	}


	public List<EaglesDTO> selectPlayersAll() {
		String sql = "select * from eagles;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}

	public List<EaglesDTO> selectCondition(String query) {
		// String query = "select * from eagles;";
		PreparedStatement pStmt = null;
		List<EaglesDTO> list = new ArrayList<EaglesDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				EaglesDTO eagles = new EaglesDTO();
				eagles.setNo(rs.getInt("no"));
				eagles.setName(rs.getString("name"));
				eagles.setPosit(rs.getString("posit"));
				eagles.setHs(rs.getString("high_school"));
				eagles.setHand(rs.getString("hand"));
				eagles.setNickname(rs.getString("nickname"));
				eagles.setBackNo(rs.getInt("back_No"));
				eagles.setBirth(rs.getString("birth"));
				eagles.setSalary(rs.getInt("salary"));

				list.add(eagles);
			}
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
		return list;
	}
	

	public void insertEagles(EaglesDTO eagles) {
		String query = "insert into eagles values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, eagles.getNo());
			pStmt.setString(2, eagles.getName());
			pStmt.setString(3, eagles.getPosit());
			pStmt.setString(4, eagles.getHs());
			pStmt.setString(5, eagles.getHand());
			pStmt.setString(6, eagles.getNickname());
			pStmt.setInt(7, eagles.getBackNo());
			pStmt.setString(8, eagles.getBirth());
			pStmt.setInt(9, eagles.getSalary());

			pStmt.executeUpdate();
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

	public void updateEagles(EaglesDTO eagles) {
		String query = "update eagles set name=?, posit=?, high_school=?, hand=?, nickname=?, back_no=?, birth=?, salary=? where no=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, eagles.getName());
			pStmt.setString(2, eagles.getPosit());
			pStmt.setString(3, eagles.getHs());
			pStmt.setString(4, eagles.getHand());
			pStmt.setString(5, eagles.getNickname());
			pStmt.setInt(6, eagles.getBackNo());
			pStmt.setString(7, eagles.getBirth());
			pStmt.setInt(8, eagles.getSalary());
			pStmt.setInt(9, eagles.getNo());

			pStmt.executeUpdate();
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
