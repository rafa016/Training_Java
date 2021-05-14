package testesql;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
public class Teste {

	public static void main(String[] args) throws 
		ClassNotFoundException, SQLException {
			//Class.forName("com.mysql.jdbc.Driver")
			String local = "jdbc:mysql://localhost:3306/test";
			String user = "root";
			String pass = "1234";
			Connection conn = DriverManager.getConnection(local,user,pass)){
			
			String sql = "SELECT * from tab";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				JOptionPane.showMessageDialog(null,  "id: " + rs.getString("id") + 
						"\ndes: " + rs.getString("des"));
			}
			rs.close();
			pstm.close();
			conn.close();
			
			
		}

	}


}