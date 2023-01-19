/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoList;

import java.sql.*;
/**
 *
 * @author Hp
 */
public class DatabaseConnection {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:330/ToDoList","root","root");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
