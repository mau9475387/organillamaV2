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
public class nuevoUser {
    Connection conectar = null;
    String user = "root";
    String password = "123456789";
    String ip = "localhost";
    String bd = "mydb";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public nuevoUser(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("INSERT INTO user VALUES (null,'carlozs','carlos@zas.com','1234','1222-12-12')");
           /* ps.setString(1,"carlos");
            ps.setString(2,"carlos@gmail.com");
            ps.setString(3,"123");*/
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "conexion exitosa");
            
            /*while(rs.next()){
                
                 int idUsuario=rs.getInt(1);
                String nombreUsuario=rs.getString(2);
                System.out.println("el id del usuario es "+idUsuario);
                System.out.println("el nombre del usuario es "+nombreUsuario);
                System.out.println();
            }*/
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "conexion error");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "sqlerror");
        }finally{
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }
        
    }public static void main(String args[]){
        nuevoUser jar = new nuevoUser();
    }
}
