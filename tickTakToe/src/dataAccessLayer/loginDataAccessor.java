/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccessLayer;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruchi
 */
public class loginDataAccessor {
    private String userName;
    private String password;
    private String actualPassword;
    
    private Statement stmnt=null;
    private Connection  databaseConnector=null;
    private DatabaseConnector myConnector=new DatabaseConnector();
    private List<player> bankList=new ArrayList();
    private ResultSet dataSet=null;
    private player tempBank=null;
    String SQLQuery=null;
    
    public String RetrieveActualPassword(String userName) throws SQLException{
            String actualPassword=null;
            
            try{
            databaseConnector=myConnector.getConnection();
            stmnt=(Statement) databaseConnector.createStatement();
            
            SQLQuery="SELECT password FROM game.login WHERE userName="+"'"+userName+"'";
            dataSet=stmnt.executeQuery(SQLQuery);
          
            while(dataSet.next()){
                actualPassword=dataSet.getString("password");
                
            }
            }
        
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
            finally{
                if(stmnt!=null)
                    stmnt.close();
                if(databaseConnector!=null)
                    databaseConnector.close();
            }
            
        return actualPassword;
        }
    
    
}
