/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ehsan
 */
public class DBHELPER {
    public static Statement st;
    public static Connection conn;
    public static PreparedStatement getData;
    public static PreparedStatement petData;
    public static PreparedStatement posData;
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/clubname","root","1960");
            st = conn.createStatement();
            getData = conn.prepareStatement("select * from player_details where country like ?");
            petData = conn.prepareStatement("select * from player_details where Name like ?");
            posData = conn.prepareStatement("select * from player_details where  position like ?");
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBHELPER.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBHELPER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static ResultSet getData(String name,String club) throws SQLException{
        getData.setString(1,"%"+name+"%");
        //getData.setString(2,"%"+club+"%");
        return getData.executeQuery();
    }
    public static ResultSet petData(String name,String club) throws SQLException{
        petData.setString(1,"%"+name+"%");
       // petData.setString(2,club);
        return petData.executeQuery();
    }
    public static ResultSet posData(String name,String club) throws SQLException{
        posData.setString(1,"%"+name+"%");
       // posData.setString(2,club);
        return posData.executeQuery();
    }
    
}
