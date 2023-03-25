package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Query {
	
	public static Criteria GetCriteria() {

		Connection conn = null;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to the MySQL database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bpmncriteria", "root", "");

			// Execute a SELECT query on a table
			String query = "SELECT * FROM criteria";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			Criteria criteria = new Criteria();
			// Process the query results
			while (rs.next()) {

				criteria.setId(rs.getInt("id"));
				criteria.setOverfitting(rs.getString("Overfitting"));
				criteria.setImbalancedDataSet(rs.getString("ImbalancedDataSet"));
				criteria.setMinoryClass(rs.getString("MinoryClass"));
				criteria.setLabeledData(rs.getString("LabeledData"));

			}

			// Close the resources
			rs.close();
			stmt.close();
			conn.close();
			
			return criteria;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;

	}
}
