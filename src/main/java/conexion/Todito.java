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


public class Todito{
    Connection conectar = null;
    String user = "root";
    String password = "123456789";
    String ip = "localhost";
    String bd = "organillama";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public Todito(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("SELECT * FROM organillama.usuario u, organillama.area a, organillama.proyecto p,organillama.actividad ac where u.idUsuario = a.idUsuario and a.idArea = p.idArea and p.idProyecto = ac.idProyecto");
            //ps.setInt(1,1);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                 int idUsuario=rs.getInt(1);
                String nombreUsuario=rs.getString(2);
                int idArea = rs.getInt(3);
                String nombreArea = rs.getString(4);
                int idProy = rs.getInt(6);
                String nombreProy = rs.getString(7);
                String deskProy = rs.getString(8);
                int idAct = rs.getInt(12);
                String nombAct = rs.getString(13);
                String deskAct = rs.getString(14);
                System.out.print("el id del usuario es "+idUsuario);
                System.out.print("---el nombre del usuario es "+nombreUsuario);
                System.out.print("--el area es "+idArea);
                System.out.print("--nombre area es "+nombreArea);
                System.out.print("--idProy es"+idProy);
                System.out.print("--nombre del proy es "+nombreProy);
                System.out.print("--la descripvion de proy es"+deskProy);
                System.out.print("--el id de la actividad es "+idAct);
                System.out.print("--el nombre de la actividad es "+nombAct);
                System.out.print("--la descripcion de la act es"+deskAct);
                System.out.println("--++++---++++--");
            }
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "conexion error2");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "sqlerror2");
        }finally{
            JOptionPane.showMessageDialog(null, "conexion exitosa2");
        }
        
    }public static void main(String args[]){
        Todito b1 = new Todito();
    }
}