package com.pacote1;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.SQLException;
public class Conecao {
	public static void main(String args[]) throws SQLException {
		String user_banco = "root";
		String pass_banco = "";
		String drive = "jdbc:mysql://localhost:3306/test?useSSL=false";
		int x = 0;
		Connection conexao = DriverManager.getConnection(drive, user_banco, pass_banco);
		Statement ps = conexao.createStatement();
		while(x<20) {
			ps.executeUpdate("insert into tab(id,des) values(default, 'pedra')");
			x+=1;
		}
		ResultSet rs = ps.executeQuery("SELECT * FROM tab" );
		while(rs.next())
			JOptionPane.showMessageDialog(null, "id: " + rs.getInt("id") + "\ndes: " + rs.getString("des"));
		//ps.executeUpdate("update tab set des = 'pedrinha' where id = 15)");
	}
}

// ta td funcionando, so o update q deu ruim