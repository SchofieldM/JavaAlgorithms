package main.com.algorithms.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseIntro {

    public DatabaseIntro(String server, String db, String user, String pass){
    	try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    	Connection conn = null;
    	try {
    	    conn =
    	       DriverManager.getConnection("jdbc:mysql://" + server + 
    	    		   "/" + db,user,pass);
    	    System.out.println(conn);
    	    conn.close();
    	} catch (SQLException ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}
    }
    
    public static void main(String[] args)
    {
   
    }
}

