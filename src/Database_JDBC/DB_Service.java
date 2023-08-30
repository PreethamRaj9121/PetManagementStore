package Database_JDBC;
import java.sql.*;

public class DB_Service {
	
	private static final String DRIVER_PATH = "oracle.jdbc.driver.OracleDriver";
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER = "SYSTEM";
    private static final String PASSWORD = "raj9121";
    
    public DB_Service() {
    	try {
			Class.forName(DRIVER_PATH);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Something went wrong"+e);
		}
    }
    
    public Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(JDBC_URL,USER,PASSWORD);
    }// End of getConnection()
}