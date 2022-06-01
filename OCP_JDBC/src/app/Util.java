package app;
import java.sql.*;
public class Util {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocpmig1","root","");
		
			//Statement stmt = conn.createStatement();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
			//int result = stmt.executeUpdate("insert into etudiant(id, nom,age) values(5, 'Mehdi', 21)");
		
			//System.out.println("Result = "+result);
			
			ResultSet rs = stmt.executeQuery("select * from etudiant"); 
			
			ResultSet rs2 = stmt.executeQuery("select id from etudiant"); 
			rs.next();
			int id = rs.getInt("id");
			String nom = rs.getString("nom");
			int age = rs.getInt("age");
			System.out.println("ID = "+id +" Nom = "+nom+" Age = "+age);
			
			
			/*while(rs.next()) {
				int id = rs.getInt("id");
				String nom = rs.getString("nom");
				int age = rs.getInt("age");
				System.out.println("ID = "+id +" Nom = "+nom+" Age = "+age);
				}*/
			/*System.out.println(rs.absolute(-1)); // true41: 
			System.out.println(rs.getInt("id")); // 2
			System.out.println(rs.getString("nom"));*/
			/*rs.afterLast();
			System.out.println(rs.previous()); 
			System.out.println(rs.getInt(1)); 
			System.out.println(rs.previous());
			System.out.println(rs.getInt(1));
			System.out.println(rs.previous());
			System.out.println(rs.getInt(1));
			System.out.println(rs.previous());
			System.out.println(rs.getInt(1));
			System.out.println(rs.previous());
			System.out.println(rs.getInt(1));
			System.out.println(rs.previous());
			System.out.println(rs.getInt(1));*/

		} catch (SQLException e) {

			System.out.println("Problème de connexion : "+e.getMessage());
		}
		finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//System.out.println(conn);

	}

}
