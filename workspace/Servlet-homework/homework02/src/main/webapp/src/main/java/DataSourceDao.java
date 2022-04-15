

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import common.pool.OracleConnectionPool;

public class DataSourceDao {
//	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//	String user = "scott";
//	String dbpwd = "tiger";
	
	public DataSourceDao() {
		
	}
//	@SuppressWarnings("resource")
	public void getUser(loginVO loginVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		ResultSet as = null;
		
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection(url,user,dbpwd);
//			con = OracleConnectionPool.getInstance().getConnection();
			
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			//2단계 insert
			pStmt = con.prepareStatement("\r\n"
					+ "INSERT\r\n"
					+ "INTO homework01(name, sex, birth, job, phone)\r\n"
					+ "VALUES(?,?,?,?,?)");
			pStmt.setString(1, loginVO.getName());
			pStmt.setString(2, loginVO.getSex());
			pStmt.setString(3, loginVO.getYear());
			pStmt.setString(4, loginVO.getJob());
			pStmt.setString(5, loginVO.getPhone());
			
			rs = pStmt.executeQuery();
			if(rs.next()) {
				System.out.println("db에 insert완료");
				loginVO.setActive(true);
			}else {
				System.out.println("insert실패");
			}
			
			// select
			ps = con.prepareStatement("SELECT\r\n"
					+ "?\r\n"
					+ "FROM homework01");
			ps.setString(1, loginVO.getName());
			
			as=ps.executeQuery();
			if(as.next()) {
				System.out.println("db에서 확인한 name ==>"+loginVO.getName());
				loginVO.setActive(true);
			}else {
				System.out.println("select실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception e1) {}
			}
			if(pStmt!=null) {
				try {
					pStmt.close();
				}catch(Exception e2) {}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e3) {}
			}
			if(ps!=null) {
				try {
					ps.close();
				}catch(Exception e4) {}
			}
			if(as!=null) {
				try {
					as.close();
				}catch(Exception e5) {}
			}
		}
	}
}
