package app;

import java.sql.*;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mig2", "root", "");
			/// Statement stmt = conn.createStatement();

			// int res = stmt.executeUpdate("insert into etudiant (nom, age, email) values
			// ('Yosri',25,'yosri@gmail.com')");
			// int res = stmt.executeUpdate("update etudiant set age=20");

			/*
			 * System.out.println("Donner votre nom"); String nom = sc.nextLine();
			 * System.out.println("Donner votre email"); String email = sc.nextLine();
			 * System.out.println("Donner votre age"); int age = sc.nextInt(); int res =
			 * stmt.executeUpdate("insert into etudiant (nom, age, email) values ('"+nom+
			 * "',"+age+",'"+email+"')"); System.out.println(res);
			 */

			/// ResultSet rs = stmt.executeQuery("select * from etudiant");
			/*
			 * while(rs.next()) {
			 * 
			 * int id = rs.getInt("id"); String nom = rs.getString("nom"); String email =
			 * rs.getString("email"); int age = rs.getInt("age");
			 * 
			 * System.out.print("ID = "+id +"\t |"); System.out.print("Nom = "+nom +"\t |");
			 * System.out.print("Email = "+email +"\t |"); System.out.print("Age = "+age
			 * +"\t "); System.out.println();
			 * 
			 * }
			 */

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from etudiant");
			ResultSet rs3 = rs ;
			rs.next();
			ResultSet rs2 = stmt.executeQuery("select * from etudiant");
			System.out.println(rs3.getInt("id")+"\t"+rs3.getString("nom"));
			//rs.afterLast();
			//rs.previous();
			//rs.afterLast();
			//rs.absolute (1);
			//rs.deleteRow();
			//System.out.println(rs.getInt("id")+"\t"+rs.getString("nom"));
			/*
			while(rs.next()) {
				
				  int id = rs.getInt("id"); String nom = rs.getString("nom"); String email =
				  rs.getString("email"); int age = rs.getInt("age");
				  
				  System.out.print("ID = "+id +"\t |"); System.out.print("Nom = "+nom +"\t |");
				  System.out.print("Email = "+email +"\t |"); System.out.print("Age = "+age
				  +"\t "); System.out.println();
				  
				  }*/
			//return;
			//System.out.println(rs.getInt("id")+"\t"+rs.getString("nom"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		System.out.println(conn);
		if(conn!=null)
			try {
				conn.close();
				System.out.println("Closed");
				System.out.println(conn);
				if(conn!=null) {
					System.out.println("Still open");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
