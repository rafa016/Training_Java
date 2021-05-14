package com.pacote1;

import com.mysql.jdbc.Connection;

public class Crudee {

	public static void main(String[] args) {
		crude cru = new crude();
		Connection con = (Connection) new Conecao();
		
		cru.salvar();
	}

}
