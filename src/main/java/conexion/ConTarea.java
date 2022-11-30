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


public class ConTarea {
    Connection conectar = null;
    String user = "root";
    String password = "123456789";
    String ip = "localhost";
    String bd = "organillama";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public ConTarea(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("SELECT * FROM usuario JOIN area ON usuario.idUsuario=area.idUsuario");
            //ps.setInt(1,1);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                 int idUsuario=rs.getInt(1);
                String nombreUsuario=rs.getString(2);
                int idArea = rs.getInt(3);
                String nombreArea = rs.getString(4);
                System.out.println("el id del usuario es "+idUsuario);
                System.out.println("el nombre del usuario es "+nombreUsuario);
                System.out.println("el area es "+idArea);
                System.out.println("nombre area es "+nombreArea);
                System.out.println("");
                
                System.out.println("");
            }
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "conexion error2");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "sqlerror2");
        }finally{
            JOptionPane.showMessageDialog(null, "conexion exitosa2");
        }
        
    }public static void main(String args[]){
        ConTarea a1 = new ConTarea();
    }
}

