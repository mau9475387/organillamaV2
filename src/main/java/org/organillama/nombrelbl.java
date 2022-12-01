/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.organillama;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Colque
 */
public class nombrelbl {
    
    private String nombrelab;
    Connection conectar = null;
    String user = "Colque";
    String password = "Colque123";
    String ip = "localhost";
    String bd = "mydb";
    String puerto = "3306";
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public String nombre(int a){
        String res = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar =DriverManager.getConnection(cadena,user,password);
           // JOptionPane.showMessageDialog(null,"base de datos encontrada");
            ps=conectar.prepareStatement("select nombre from user where iduser="+a+";");
            //ps.setInt(1,1);
            rs=ps.executeQuery();

            while(rs.next()){

                String name=rs.getString(1);
                nombrelab=name;
                res = nombrelab;
            }

        } catch (ClassNotFoundException e) {
    //        JOptionPane.showMessageDialog(null, "conexion error2");
        } catch(SQLException e){
    //       JOptionPane.showMessageDialog(null, "sqlerror2");
        }finally{
    //        JOptionPane.showMessageDialog(null, "conexion exitosa2");
        }
        return res;
}
}
