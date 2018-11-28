
/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */


package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author philip
 */
public class DAO {
    
    DBUtils data = new DBUtils();
    @SuppressWarnings("FieldMayBeFinal")
    BufferedReader input;
    PreparedStatement stmt;

    public DAO() {
        data.getConnected();
    }
      
    
    /**
     * Reads the sql file and returns the sql
     * statement as a string.
     * @param fileName
     * @return 
     */
    private String getSQL(String fileName){
        try {
            input = new BufferedReader(new FileReader(fileName));
            
            StringBuilder builder = new StringBuilder();
            String line = input.readLine();
            
            while(line != null){
                builder.append(line);
                line = input.readLine();
            }
            
            return builder.toString();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /**
     * 
     * @param sqlFile 
     */
    public void setStatment(String sqlFile){
        try {
            //read the sql file and return sql as string
            String sql = this.getSQL(sqlFile);
            stmt = data.getConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * set parameters in prepared statement
     * @param params 
     */
    public void setData(String[] params){
        int len = params.length;
        try {
            for(int i=0;i<len;i++){
                 stmt.setString(i+1, params[i]);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * 
     */
    public void runSQL(){
        try {            
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
