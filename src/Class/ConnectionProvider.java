/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ehsan
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");

    
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/clubname","root","1960");
        }
        
        catch(Exception e)
        {
             return null;
        }
       
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//import com.sun.jdi.connect.spi.Connection;


/**
 *
 * @author Asus
 */
