package TechnicalServices;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class DataConnector {

    private static DataConnector thisDataConnector;
    private Statement stmt;
    private Connection connection;
    private ResultSet rs;
            
    
    private String POSTGRESQL_PORT="5432";
    private String POSTGRESQL_IP="localhost";
    private String POSTGRESQL_DATABASE_NAME="ayo";
    private String POSTGRESQL_USERNAME="serhat";
    private String POSTGRESQL_PASSWORD="serhat";
    
    
    private DataConnector(){
            startConnection();
    }
    
    public static DataConnector getInstance(){
            if( thisDataConnector == null)
                    thisDataConnector = new DataConnector();
            return thisDataConnector;
                    
    }
    
    private boolean startConnection(){
            try{
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(("jdbc:postgresql://"+POSTGRESQL_IP+":"+POSTGRESQL_PORT+"/"+POSTGRESQL_DATABASE_NAME), POSTGRESQL_USERNAME, POSTGRESQL_PASSWORD);
                    stmt = connection.createStatement();
                    System.out.println("Veritabanı ile bağlantı kuruldu");
                    return true;
            }
            catch(Exception e){
                    e.printStackTrace();
                    return false;
            }
    }
    
    public ResultSet query(String query){
            try{
                    rs = stmt.executeQuery(query);
                    return rs;
            }
            catch(Exception e){
                    e.printStackTrace();
                    return null;
            }
    }
    
    public Boolean update(String query){
            try{
                    stmt.executeUpdate(query);
                    System.out.println("query ok");
                    return true;
            }
            catch(Exception e){
                    e.printStackTrace();
                    return false;
            }
    }

    
    public static void main(String[] args){
    	
    	DataConnector d = new DataConnector();
//    	d.startConnection();
	
    }
	
}

