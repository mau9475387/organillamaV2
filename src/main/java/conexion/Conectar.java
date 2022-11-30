/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author padil
 */
public class Conectar {
    static String db="mydb";
    static String login="root";
    static String password="123456789";
    static String url="jdbc:mysql://localhost/"+db;
    Connection connection = null;
    public Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =DriverManager.getConnection(url,login,password);
            if(connection!=null){
                System.out.println("conexion a la base de datos ok");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println("ex.getMessage()");
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public void desconectar(){
        try {
            System.out.println("cerrando conexion");
            connection.close();
        } catch (Exception ex) {
        }
    }
}
