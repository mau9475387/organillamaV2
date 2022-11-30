package ConexionMysql;

import ConexionMysql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Colque
 */

public class ConexionMysql {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
        public Connection conectar(){
         try {
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/llamadev","Colque","Colque123");
            System.out.println("CONECTADO");
            } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION BD"+e);
            }
            return cn;
    }    
}

