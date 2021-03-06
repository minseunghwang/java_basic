package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test06_update {
	public static void main(String[] args) {
		
		String sql ="update book set title=?,price=? where bookno=?"; 
		
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			st = con.createStatement();
			
			ps = con.prepareStatement(sql);
			//? 세팅작업 
			ps.setString(1, "centos");
			ps.setInt(2, 2000);
			ps.setInt(3, 4);
			
			//실행
			row = ps.executeUpdate();
			//결과값핸들링
			System.out.println("update row :"+row);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		
		

	}
}






