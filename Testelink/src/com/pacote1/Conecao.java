package com.pacote1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Conecao {

	
	private String user_banco = "root";

	private String pass_banco = "1234";
	
	private String drive = "jdbc:mysql://localhost:3306/test";
	
	
	
	
	public Connection getConnection() {
		
		
		try{
			Class.forName(drive);
			return DriverManager.getConnection(user_banco);
			
			
		}catch(SQLException | ClassNotFoundException e) {
			
			throw new RuntimeException("Erro na conexao",e);
		}
		
		
		
		
	}
}
