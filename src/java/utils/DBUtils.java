
/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */


package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import src.Password;


/**
 *
 * @author philip
 */
public class DBUtils implements DBConnect{
    
    Password pass = new Password();
    
    private static final String url = "jdbc:mysql://localhost:3306/clients?autoReconnect=true&useSSL=false";
    private static final String uname = "tetrapro";
    private final String upass = ;
    private Connection connection;

    /**
     * Connection to database is private 
     * so we need a public getter method
     * whereby we can get access to the 
     * connection.
     * @return 
     */
    public Connection getConnection() {
        return connection;
    }
        
    /**
     * A tester method that tests 
     * whether or not the connection
     * is currently connected.
     * @return true if it is
     * flase otherwise
     */
    public boolean isConnected(){
        boolean isConnected = false;
        if(connection == null){//not connected
            return isConnected;
        }else{//otherwise is connected
            isConnected = true;
            return isConnected;
        }             
   }

    @Override
    public void getConnected() {
        try {
            connection = DriverManager.getConnection(url, uname, upass);         
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
