package basic05;

import java.sql.*;
import java.util.*;

public class BbsDAO {
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";

	public BbsDAO() { 									// MySQL Connect
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public int check(int id, String password) {		// login check
		boolean c = false;
		String query = "select * from member;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				if (id == rs.getInt("id")) {
					if (password.equals(rs.getString("password"))) {
						c = true;
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
		return id;
	}
	
	
	public List<BbsDTO> selectCondition(String query) { // condition
		PreparedStatement pStmt = null;
		List<BbsDTO> list = new ArrayList<BbsDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				BbsDTO bbsmember = new BbsDTO();

				bbsmember.setId(rs.getInt("id"));
				bbsmember.setMemberid(rs.getInt("memberId"));
				bbsmember.setTitle(rs.getString("title"));
				bbsmember.setDate(rs.getString("date"));
				bbsmember.setContent(rs.getString("content"));

				list.add(bbsmember);
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
	
	
	public List<BbsDTO> selectBbsAll() { 				// select All
		String sql = "select * from Bbs order by id";
		List<BbsDTO> bbsList = selectCondition(sql);
		return bbsList;
	}
	
	public BbsDTO selectMemberId(String id) { // select name
		String query = "select * from Member where name like '" + id + "';";
		PreparedStatement pStmt = null;
		BbsDTO bbsmember = new BbsDTO();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				bbsmember.setId(rs.getInt("id"));
				bbsmember.setMemberid(rs.getInt("memberId"));
				bbsmember.setTitle(rs.getString("title"));
				bbsmember.setDate(rs.getString("date"));
				bbsmember.setContent(rs.getString("content"));
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
		return bbsmember;
	}
	
	
	public BbsDTO selectBbsOne(int id) { 				// select One
		String query = "select * from Bbs where id=?;";
		PreparedStatement pStmt = null;
		BbsDTO bbsmember = new BbsDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				bbsmember.setId(rs.getInt("id"));
				bbsmember.setMemberid(rs.getInt("memberId"));
				bbsmember.setTitle(rs.getString("title"));
				bbsmember.setDate(rs.getString("date"));
				bbsmember.setContent(rs.getString("content"));
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
		return bbsmember;
	}
	
	public void insertBbs(BbsDTO bbs) { // insert
		BbsDTO bbsmember = new BbsDTO();
		String query = "insert into bbs (memberId, title, content) values(?, ?, ?);";	
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, 100006);
			pStmt.setString(2, bbsmember.getTitle());
			pStmt.setString(3, bbsmember.getContent());

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
	
	public void deleteBbs (int id) { // delete
		String query = "delete from bbs where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);

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
	
	public void close() { 								// close
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
