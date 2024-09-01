/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_banking_system;

/**
 *
 * @author ANKITA
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    static Connection conn=null;
    
    public static Connection connectDb()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
	    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management","root","Ankita@24");
            System.out.println("Connected sucessfully");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
