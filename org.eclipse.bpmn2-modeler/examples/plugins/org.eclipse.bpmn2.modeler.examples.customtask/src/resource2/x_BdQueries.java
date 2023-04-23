package resource2;

import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projetTemplate.Componenets;
import projetTemplate.ComputationalRequirementValue;
import projetTemplate.DataAnalysisProblem;
import projetTemplate.DataAnalysisProblemType;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSelectionCriteriaContainer;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.ProjetTemplateFactory;
import projetTemplate.SelectionCriteria;
import projetTemplate.SelectionCriterion;

public class x_BdQueries {

	public x_BdQueries () {
		int i = 0;
	}
	public static String SQL_LAST_ID = "SELECT AUTO_INCREMENT as id \r\n"
										+ "FROM  INFORMATION_SCHEMA.TABLES\r\n"
										+ "WHERE TABLE_SCHEMA = 'templateproject' \r\n"
										+ "AND   TABLE_NAME   = 'chaines' ";
	
	public static String SQL_INSERT_CHAINE = " INSERT INTO chaines (name, chaine) \r\n " + 
			 								 " VALUES (?, ?)" ;
	
	public static String SQL_UPDATE_CHAINE_BY_ID = " UPDATE chaines  " + 
			 									"SET chaine = ?" +
			 									"WHERE id = ?";
	
	public static String SQL_UPDATE_CHAINE_BY_NAME = " UPDATE chaines  " + 
													"SET chaine = ?" +
													"WHERE name = ? AND isDeleted = 0";
	
	public static String SQL_LIST_OF_CHAINES = " SELECT * "
												+ "FROM chaines "
												+ "WHERE isDeleted = 0" ;
	
	public static String SQL_CHAINE_BY_ID = " SELECT * "
											+ "FROM chaines "
											+ "WHERE id=? AND isDeleted = 0" ;

	public static String SQL_CHAINE_TEMPLATE = " SELECT * "
											+ "FROM chaines "
											+ "WHERE name='Template.bpmn'" ;
	
	public static String SQL_ALL_CHAINE = " SELECT * "
										+ "FROM chaines "
										+ "WHERE isDeleted = 0"; 

	public static String SQL_CHAINE_BY_NAME = " SELECT * "
											+ "FROM chaines "
											+ "WHERE name=? AND isDeleted = 0" ;
	
	public static String SQL_DELETE_CHAINE = " UPDATE chaines  " + 
											"SET isDeleted = 1 " +
											"WHERE id = ? AND isDeleted = 0";
	
	public static String SQL_INSERT_SELECTION_CRITERIA = " INSERT INTO criteria (name, value, type, formula, id_name_value) \r\n " + 
			 											" VALUES (?, ?, ?, ?, ?)" ;
	
	public static String SQL_INSERT_ML_ALGORITHM = " INSERT INTO algorithms (name, category) \r\n " + 
														" VALUES (?, ?)" ;
	
	public static String SQL_INSERT_ML_ALGORITHM_CRITERIA = " INSERT INTO algorithmscriterias (algorithmId, criteriaId ) \r\n " + 
													" VALUES (?, ?)" ;
	
	public static String SQL_ALGORITHM_ID_BY_NAME = " SELECT * "
													+ "FROM algorithms "
													+ "WHERE name=? " ;
	
	public static String SQL_CRITERIA_ID_BY_ID_NAME_VALUE = " SELECT * "
														+ "FROM criteria "
														+ "WHERE id_name_value=? " ;
	
	public static String SQL_ALGORITHM_ID_BY_CATEGOPRY = " SELECT * "
														+ "FROM algorithms "
														+ "WHERE category=? " ;
	
	public static String SQL_CRITERIA_FOR_ALGORITM = "SELECT * "
														+ "FROM algorithmscriterias as algorCriter, criteria as crit "
														+ "WHERE algorCriter.algorithmId = ? AND crit.id = algorCriter.criteriaId " ;
	
	
	public static void deleteChaine(int key) {
		 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_DELETE_CHAINE);
			preparedStatement.setInt(1, key); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate();

		} catch (Exception  e) { 
			 
			 e.printStackTrace() ;
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static void UpdateChaine(int id, String chaine, File file) {
 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_UPDATE_CHAINE_BY_ID);
			preparedStatement.setString(1, chaine);
			preparedStatement.setInt(2, id); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate(); 
			
			file.delete();
			
		} catch (Exception  e) { 
			 
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static void UpdateChaineByName(File file, String chaine) {
 
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_UPDATE_CHAINE_BY_NAME);
			preparedStatement.setString(1, chaine);
			preparedStatement.setString(2, file.getName()); 
			
			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate(); 
			
			file.delete();
			
		} catch (Exception  e) { 
			 
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
 
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static List<Chaine> loadALLChaine() {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null; 

		PreparedStatement preparedStatement = null;

		List<Chaine> listBlob = new ArrayList<Chaine>();
		
		try {

			preparedStatement = con.prepareStatement(SQL_ALL_CHAINE); 

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				listBlob.add(new Chaine(resultSet.getBlob("chaine"), resultSet.getString("name")));
			} 

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return listBlob;
	}
	
	
	public static Blob loadChaine(int id) {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null; 

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = con.prepareStatement(SQL_CHAINE_BY_ID);
			preparedStatement.setInt(1, id);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				return resultSet.getBlob("chaine");
			} 

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return null;
	}
	
	public static Blob loadTemplate() {

		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null; 

		PreparedStatement preparedStatement = null;

		try {

			preparedStatement = con.prepareStatement(SQL_CHAINE_TEMPLATE);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				return resultSet.getBlob("chaine");
			} 

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			connClass.close(con);
			connClass.close(preparedStatement);
			connClass.close(resultSet);
		}

		return null;
	}
	
	
	public static List<ComboItem> getListOfChaines() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		
		String query = SQL_LIST_OF_CHAINES; 
		List<ComboItem> listOfChaines = new ArrayList<ComboItem>();
		 
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			
			while (resultSet.next()) {
				
				listOfChaines.add(new ComboItem(resultSet.getInt("id"),  resultSet.getString("name")));
			}; 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return listOfChaines;
		
	}
	
	
	public static int getLastId() {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		
		String query = SQL_LAST_ID; 
		int id = 0 ;
		try {
			
			statement = con.createStatement();
			resultSet = statement.executeQuery(query);
			resultSet.next();
			id =  resultSet.getInt("id"); 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return id;
	} 
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static int insertChaine(File file, String chaine) {
 
		if (isChaineExist(file.getName())) {
			UpdateChaineByName(file, chaine);
			
			return 0;
		} else { 
			
			ConnectionClass connClass = new ConnectionClass();
			Connection con = connClass.getFileFromResources();
			ResultSet resultSet = null;
			Statement statement = null; 
			 
			try {
	
				PreparedStatement preparedStatement;
	
				preparedStatement = con.prepareStatement(SQL_INSERT_CHAINE);
				preparedStatement.setString(1, file.getName());
				preparedStatement.setString(2, chaine); 
				
				// on duplicate chaine with the same name throw exception 
				preparedStatement.executeUpdate();
				 
			    if (file.delete()) { 
			        System.out.println("Deleted the file: " + file.getName());
			      } else {
			        System.out.println("Failed to delete the file.");
			      } 
			    
				return getLastId() - 1;
	//			int last_inserted_id = 0;
	//
	//			ResultSet rs = preparedStatement.getGeneratedKeys();
	//			if (rs.next()) {
	//				last_inserted_id = rs.getInt(1);
	//			}
	//
	//			return last_inserted_id;
				
			} catch (Exception  e) { 
				 
				return 0;
				
			} finally {
				connClass.close(con);
				connClass.close(statement);
				connClass.close(resultSet);
			}
		}
	}
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static int insertCriteria(SelectionCriteria selectionCriteria, String type, String formula) {
 
			
			ConnectionClass connClass = new ConnectionClass();
			Connection con = connClass.getFileFromResources();
			ResultSet resultSet = null;
			Statement statement = null; 
			 
			try {
	
				PreparedStatement preparedStatement;
	
				preparedStatement = con.prepareStatement(SQL_INSERT_SELECTION_CRITERIA);
				preparedStatement.setString(1, selectionCriteria.getCriteriaName());
				preparedStatement.setString(2, selectionCriteria.getCriteriaValue()); 
				preparedStatement.setString(3, type); 
				preparedStatement.setString(4, formula); 
				preparedStatement.setString(5, selectionCriteria.getId()); 


				// on duplicate chaine with the same name throw exception 
				preparedStatement.executeUpdate();
				 
	            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	                if (generatedKeys.next()) {
	                    int id = generatedKeys.getInt(1);
	                    System.out.println("Inserted user with ID: " + id);
	                    
	                    return id;
	                } else {
	                    throw new SQLException("Creating user failed, no ID obtained.");
	                }
	            }
	             
	            
			} catch (Exception  e) { 
				 
				return 0;
				
			} finally {
				connClass.close(con);
				connClass.close(statement);
				connClass.close(resultSet);
			} 
	}
	
	
	
	
	/**
	 * Insert the chaine
	 * @param chaine
	 */
	public static int insertAlgorithm(String name, String category) {
 
			
			ConnectionClass connClass = new ConnectionClass();
			Connection con = connClass.getFileFromResources();
			ResultSet resultSet = null;
			Statement statement = null; 
			 
			try {
	
				PreparedStatement preparedStatement;
	
				preparedStatement = con.prepareStatement(SQL_INSERT_ML_ALGORITHM);
				preparedStatement.setString(1, name);
				preparedStatement.setString(2, category);  

				// on duplicate chaine with the same name throw exception 
				preparedStatement.executeUpdate();
				 
	            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
	                if (generatedKeys.next()) {
	                    int id = generatedKeys.getInt(1);
	                    System.out.println("Inserted user with ID: " + id);
	                    
	                    return id;
	                } else {
	                    throw new SQLException("Creating user failed, no ID obtained.");
	                }
	            }
	            
			} catch (Exception  e) { 
				 
				return 0;
				
			} finally {
				connClass.close(con);
				connClass.close(statement);
				connClass.close(resultSet);
			} 
	}
	
	
	public static int GetIdAlgorithm(String nameAlgorithm) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		PreparedStatement preparedStatement = null;

		ResultSet resultSet = null;
		Statement statement = null; 
		 
		int id = 0 ;
		try {
			preparedStatement = con.prepareStatement(SQL_ALGORITHM_ID_BY_NAME);
			preparedStatement.setString(1, nameAlgorithm);

			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			id =  resultSet.getInt("id"); 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return id;
	} 
	
	
	public static DataAnalysisProblemType GetdAlgorithmsByCategory(String caetgory) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		PreparedStatement preparedStatement = null;
		
		
		DataAnalysisProblemType dataAnalysisProblemType = ProjetTemplateFactory.eINSTANCE.createDataAnalysisProblemType();


		
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		int id = 0 ;
		try {
			preparedStatement = con.prepareStatement(SQL_ALGORITHM_ID_BY_CATEGOPRY);
			preparedStatement.setString(1, caetgory);

			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int algorithmId = resultSet.getInt("id"); 
				
				MLAlgorithm mlalgorithm = GetCriteriasByIdAlgorithm(algorithmId, caetgory);
				
				mlalgorithm.setName(resultSet.getString("name"));

				MLAlgorithmSolutionPattern mlAlgorithmSolutionPattern = ProjetTemplateFactory.eINSTANCE.createMLAlgorithmSolutionPattern(); 
				mlAlgorithmSolutionPattern.setMlalgorithm(mlalgorithm);
				
				dataAnalysisProblemType.getMlalgorithmsolutionpattern().add(mlAlgorithmSolutionPattern);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return dataAnalysisProblemType;
	} 
	
	
	public static MLAlgorithm GetCriteriasByIdAlgorithm(int algorithmId, String category) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		PreparedStatement preparedStatement = null;
		
		
		MLAlgorithm mlAlgroithm = ProjetTemplateFactory.eINSTANCE.createMLAlgorithm();
		mlAlgroithm.setCriteriatochoosemlalgorithm( ProjetTemplateFactory.eINSTANCE.createMLAlgorithmSelectionCriteriaContainer());
		//mlAlgroithm.getCriteriatochoosemlalgorithm().setComponenet(Componenets(category));
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		int id = 0 ;
		try {
			preparedStatement = con.prepareStatement(SQL_CRITERIA_FOR_ALGORITM);
			preparedStatement.setInt(1, algorithmId);

			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				ComputationalRequirementValue selectionCriteria = ProjetTemplateFactory.eINSTANCE.createComputationalRequirementValue();

				selectionCriteria.setCriteriaName(resultSet.getString("name"));
				selectionCriteria.setCriteriaValue(resultSet.getString("value"));
				selectionCriteria.setFormule(resultSet.getString("formula"));
				selectionCriteria.setId(resultSet.getString("id_name_value"));
				 
				mlAlgroithm.getCriteriatochoosemlalgorithm().getSelectionCriteria().add(selectionCriteria);
				
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return mlAlgroithm;
	} 
	
	
	public static int GetIdCriteria(String IdCriteriaNameValue) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		PreparedStatement preparedStatement = null;

		ResultSet resultSet = null;
		Statement statement = null; 
		 
		int id = 0 ;
		try {
			preparedStatement = con.prepareStatement(SQL_CRITERIA_ID_BY_ID_NAME_VALUE);
			preparedStatement.setString(1, IdCriteriaNameValue);

			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			id =  resultSet.getInt("id"); 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
		
		return id;
	} 
	
	public static int insertAlgorithmCriteria(String nameAlgorithm, String IdCriteriaNameValue) {
		 
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null; 
		 
		int algorithmId = GetIdAlgorithm(nameAlgorithm);
		int criteriaId = GetIdCriteria(IdCriteriaNameValue);
		
		try {

			PreparedStatement preparedStatement;

			preparedStatement = con.prepareStatement(SQL_INSERT_ML_ALGORITHM_CRITERIA);
			preparedStatement.setInt(1, algorithmId);
			preparedStatement.setInt(2, criteriaId);  

			// on duplicate chaine with the same name throw exception 
			preparedStatement.executeUpdate();
			 
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    System.out.println("Inserted user with ID: " + id);
                    
                    return id;
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
            
		} catch (Exception  e) { 
			 
			return 0;
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		} 
}
	
	
	public static boolean isChaineExist(String name) {
		
		ConnectionClass connClass = new ConnectionClass();
		Connection con = connClass.getFileFromResources();
		ResultSet resultSet = null;
		Statement statement = null;  
		
		try {
			PreparedStatement preparedStatement;
			preparedStatement = con.prepareStatement(SQL_CHAINE_BY_NAME);
			preparedStatement.setString(1, name);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				return true;
			} 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			connClass.close(con);
			connClass.close(statement);
			connClass.close(resultSet);
		}

		return false;

	}



}
