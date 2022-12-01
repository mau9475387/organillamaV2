package org.organillama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Colque
 */
public class NuevaActSql {
    Connection conectar = null;
    String user = "Colque";
    String password = "Colque123";
    String ip = "localhost";
    String bd = "mydb";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;

    public NuevaActSql(String nombre,String fecha,String descripcion,String horaInicio,String horaFin,int idProyecto){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("INSERT INTO actividad VALUES (null,?,?,?,?,?,?);");
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setString(3, fecha);
            ps.setString(4,horaInicio);
            ps.setString(5, horaFin);
            ps.setInt(6, idProyecto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "conexion exitosa");



        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "conexion error");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "sqlerror");
        }finally{
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }

    }
}

