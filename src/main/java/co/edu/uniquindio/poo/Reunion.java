package co.edu.uniquindio.poo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;


//Clase para la creacion de reuniones
public class Reunion {
    public String fecha;
    public String descripcion;
    public String hora;
    public Collection <Contacto> listaAsistencia;
    public Collection <Reunion> reuniones;
    


    //Metodo costructor de la clase Reunion
    public Reunion( String fecha, String descripcion, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.listaAsistencia = new ArrayList<>();
    }


    public Collection<Contacto> getListaAsistencia() {
        return listaAsistencia;
    }

    public void setListaAsistencia(Collection<Contacto> listaAsistencia) {
        this.listaAsistencia = listaAsistencia;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    

    @Override
    public String toString() {
        return "Reunion [fecha=" + fecha + ", descripcion=" + descripcion + ", hora=" + hora + ", listaAsistencia="
                + listaAsistencia + ", reuniones=" + reuniones + "]";
    }

    //Metodo para agregar la lista de contactos asistentes a una reunion
    public void agregarListaAsistentes(Contacto contacto) {
        listaAsistencia.add(contacto);
    }

    //Metodo para eliminar los reuniones
    //public void eliminarReunion(Reunion reunion) {
        //if  (reuniones.contains(reunion)){
            //reuniones.remove(reunion);
        //}
    //}



}
