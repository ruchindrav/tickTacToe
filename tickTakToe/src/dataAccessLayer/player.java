/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccessLayer;

/**
 *
 * @author Ruchi
 */
public class player {
    private String userName;
    private String password;
    private String actualPassword;
    private int Score;
    
    public player(String name,String password,int score){
        this.userName=name;
        this.password=password;
        this.Score=score;
    }
    public player(String name,String password){
        this.userName=name;
        this.password=password;
      
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the Score
     */
    public int getScore() {
        return Score;
    }

    /**
     * @return the actualPassword
     */
    public String getActualPassword() {
        return actualPassword;
    }

    /**
     * @param actualPassword the actualPassword to set
     */
    public void setActualPassword(String actualPassword) {
        this.actualPassword = actualPassword;
    }
    
    public boolean validate(){
        if(this.password==this.actualPassword){
            return true;
        }
        else{
            return false;
        }
    }
}
