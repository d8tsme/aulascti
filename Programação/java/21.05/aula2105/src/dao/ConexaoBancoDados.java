package dao;

import java.sql.*;

public class ConexaoBancoDados {
	private static final String URL = "jdbc:mysql://localhost:3306/Aula2105";
	private static final String USR = "root";
	private static final String PWD = "root";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USR, PWD);
	}
}
