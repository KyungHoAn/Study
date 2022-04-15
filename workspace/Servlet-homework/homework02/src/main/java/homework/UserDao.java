package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jw.common.pool.OracleConnectionPool;

public class UserDao {
	
	public UserDao() {
		
	}
	public void getUser(UserVO loginVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/ora");
			con = ds.getConnection();
			
			//2�ܰ� insert
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
				System.out.println("db�� insert�Ϸ�");
				loginVO.setActive(true);
			}else {
				System.out.println("insert����");
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
		}
	}
	public UserVO findId(String name) {
		UserVO userVO = new UserVO();
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			con = OracleConnectionPool.getInstance().getConnection();
			
			pStmt = con.prepareStatement("select name,sex,birth,job,phone from homework01\r\n"
					+ "where name =?");
			pStmt.setString(1,name);
			
			rs = pStmt.executeQuery();
			
			//��� Ȯ��
			//1.select�� ��� UserVO��ü ArrayList�� ����
			if(rs.next()) {
				userVO.setName(rs.getString("name"));
				userVO.setSex(rs.getString("sex"));
				userVO.setYear(rs.getString("birth"));
				userVO.setJob(rs.getString("job"));
				userVO.setPhone(rs.getString("phone"));
				System.out.println(userVO);
			}else {
				System.out.println("select false");
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
		}
		return userVO;
	}
	
}
