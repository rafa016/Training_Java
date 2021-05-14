package com.pacote1;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class crude {
	
	static Connection con = (Connection) new Conecao();
	
	public static void salvar() {
		try {
			con.prepareStatement("insert into tab (int,des) VALUES('Rafael',1234)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
