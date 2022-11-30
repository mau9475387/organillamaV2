/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import conexion.Actividad;
import conexion.Conectar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author padil
 */
public class ListaAct {
    private int idUser;
    private int idArea;
    private int idSubArea;
    private String fecha;
    public ArrayList<Actividad> listaActividades(int n){
        idUser = n;
        ArrayList<Actividad> list1= new ArrayList<Actividad>();
        Conectar conec = new Conectar();
        String sql = "SELECT idactividad,nombreact,descripcion,fecha,horaini,horafin,idproy\n" +
                     "FROM mydb.user u,mydb.proyecto p ,mydb.subarea s,mydb.area a,mydb.actividad act\n" +
                     "WHERE iduser="+idUser+";";
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            ps=conec.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Actividad act = new Actividad();
                act.setIdActividad(rs.getInt(1));
                act.setNombreActividad(rs.getString(2));
                act.setDescripcionActividad(rs.getString(3));
                act.setFecha(rs.getString(4));
                act.setHoraInicio(rs.getString(5));
                act.setHoraFin(rs.getString(6));
                act.setIdProyecto(rs.getInt(7));
                list1.add(act);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list1;
    } 
    public ArrayList<Actividad> listaActividadesArea(int n,int area){
        idUser = n;
        idArea=area;
        ArrayList<Actividad> list2= new ArrayList<Actividad>();
        Conectar conec = new Conectar();
        String sql = "SELECT idactividad,nombreact,descripcion,fecha,horaini,horafin,idproy\n" +
                     "FROM mydb.user u,mydb.proyecto p ,mydb.subarea s,mydb.area a,mydb.actividad act\n" +
                     "WHERE iduser="+idUser+" and idarea="+idArea+";";
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            ps=conec.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Actividad act = new Actividad();
                act.setIdActividad(rs.getInt(1));
                act.setNombreActividad(rs.getString(2));
                act.setDescripcionActividad(rs.getString(3));
                act.setFecha(rs.getString(4));
                act.setHoraInicio(rs.getString(5));
                act.setHoraFin(rs.getString(6));
                act.setIdProyecto(rs.getInt(7));
                list2.add(act);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list2;
    } 
    public ArrayList<Actividad> listaActividadesSubArea(int n,int area,int subA){
        idUser = n;
        idArea=area;
        idSubArea=subA;
        ArrayList<Actividad> list3= new ArrayList<Actividad>();
        Conectar conec = new Conectar();
        String sql = "SELECT idactividad,nombreact,descripcion,fecha,horaini,horafin,idproy\n" +
                     "FROM mydb.user u,mydb.proyecto p ,mydb.subarea s,mydb.area a,mydb.actividad act\n" +
                     "WHERE iduser="+idUser+" and area= "+idArea+" and idsubarea="+idSubArea+";";
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            ps=conec.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Actividad act = new Actividad();
                act.setIdActividad(rs.getInt(1));
                act.setNombreActividad(rs.getString(2));
                act.setDescripcionActividad(rs.getString(3));
                act.setFecha(rs.getString(4));
                act.setHoraInicio(rs.getString(5));
                act.setHoraFin(rs.getString(6));
                act.setIdProyecto(rs.getInt(7));
                list3.add(act);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list3;
    } 
    public ArrayList<Actividad> listaActividadesFecha(int n,int area,int suba,String date){
        idUser = n;
        idArea = area;
        idSubArea =suba;
        fecha=date;
        ArrayList<Actividad> list= new ArrayList<Actividad>();
        Conectar conec = new Conectar();
        String sql = "SELECT idactividad,nombreact,descripcion,fecha,horaini,horafin,idproy\n" +
                     "FROM mydb.user u,mydb.proyecto p ,mydb.subarea s,mydb.area a,mydb.actividad act\n" +
                     "WHERE iduser="+idUser+" and area = "+idArea+" and idsubarea = "+idSubArea+" and fecha="+fecha+";";
        ResultSet rs=null;
        PreparedStatement ps=null;
        try {
            ps=conec.getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Actividad act = new Actividad();
                act.setIdActividad(rs.getInt(1));
                act.setNombreActividad(rs.getString(2));
                act.setDescripcionActividad(rs.getString(3));
                act.setFecha(rs.getString(4));
                act.setHoraInicio(rs.getString(5));
                act.setHoraFin(rs.getString(6));
                act.setIdProyecto(rs.getInt(7));
                list.add(act);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
}
