/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author padil
 */
public class Actividad {
    private int idActividad;
    private String nombreActividad;
    private String descripcionActividad;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private int idProyecto;
    
    
    public Actividad(int idActividad,String nombreActividad,String descripcionActividad,String fecha,String horaInicio,
            String horaFin,int idProyecto){
        this.idActividad=idActividad;
        this.nombreActividad=nombreActividad;
        this.descripcionActividad=descripcionActividad;
        this.fecha=fecha;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.idProyecto=idProyecto;
             
    }
    public Actividad(){
    }
    public int getIdActividad(){
        return idActividad;
    }
    public void setIdActividad(int nuevo){
        idActividad=nuevo;
    }
    public String getNombreActividad(){
        return nombreActividad;
    }
    public void setNombreActividad(String nuevo){
        nombreActividad=nuevo;
    }
    public String getDescripcionActividad(){
        return descripcionActividad;
    }
    public void setDescripcionActividad(String nuevo){
        descripcionActividad=nuevo;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String nuevo){
        fecha=nuevo;
    }
    public String getHoraInicio(){
        return horaInicio;
    }
    public void setHoraInicio(String nuevo){
        horaInicio=nuevo;
    }
    public String getHoraFin(){
        return horaFin;
    }
    public void setHoraFin(String nuevo){
        horaFin=nuevo;
    }
    public int getIdProyecto(){
        return idProyecto;
    }
    public void setIdProyecto(int nuevo){
        idProyecto=nuevo;
    }

}
