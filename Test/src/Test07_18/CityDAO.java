package Test07_18;

import java.sql.Connection;
import java.sql.*;
import java.util.*;


public class CityDAO {
	
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String PASSWORD = "javapass";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public CityDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List<CityDTO> selectManyPeople(){
		String sql = "select * from city where Population >=1000000 and CountryCode = 'KOR' order by Population desc ;";
		List<CityDTO> CityDTO = selectCondition(sql);
		return CityDTO;
	}
	
	public List<CityDTO> selectCondition(String query) {
		PreparedStatement pStmt = null;
		List<CityDTO> cityList = new ArrayList<CityDTO>();
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				CityDTO city = new CityDTO();
				city.setId(rs.getInt("ID"));
				city.setName(rs.getString("Name"));
				city.setCountryCode(rs.getString("CountryCode"));
				city.setDistrict(rs.getString("District"));
				city.setPopulation(rs.getInt("Population"));
				cityList.add(city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pStmt != null && !pStmt.isClosed())
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return cityList;
	}
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}