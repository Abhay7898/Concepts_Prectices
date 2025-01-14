package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Connectivity {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concepts_prectices?characterEncoding=utf8","root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student(roolNo,firstname,lastname,dep,age)value(?,?,?,?,?)");
			ps.setInt(1, 101);
			ps.setString(2, "Abhay");
			ps.setString(3, "Garhwal");
			ps.setString(4, "MCA");
			ps.setInt(5, 24);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
