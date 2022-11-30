/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author padil
 */
public class CConexion {
    Connection conectar = null;
    String user = "root";
    String password = "123456789";
    String ip = "localhost";
    String bd = "organillama";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public CConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("SELECT * FROM usuario ");
            //ps.setInt(1,1);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                 int idUsuario=rs.getInt(1);
                String nombreUsuario=rs.getString(2);
                System.out.println("el id del usuario es "+idUsuario);
                System.out.println("el nombre del usuario es "+nombreUsuario);
                System.out.println();
            }
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "conexion error");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "sqlerror");
        }finally{
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }
        
    }public static void main(String args[]){
        CConexion con = new CConexion();
    }
}
