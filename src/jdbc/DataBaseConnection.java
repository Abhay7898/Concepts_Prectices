package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBaseConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concepts_prectices?characterEncoding=utf8", "root", "root");
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO student (roolNo, firstName,lastName, dep, age) VALUES (?,?,?,?,?)");
		ps.setInt(1, 103);
		ps.setString(2, "Abhay");
		ps.setString(3, "Garhwal");
		ps.setString(4, "MCA");
		ps.setInt(5, 23);
		ps.execute();
	}
}
