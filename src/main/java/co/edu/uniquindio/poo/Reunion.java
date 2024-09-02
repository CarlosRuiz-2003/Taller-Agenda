package co.edu.uniquindio.poo;

import java.util.List;
import java.sql.Date;
import java.util.Collection;
import java.util.LinkedList;

public class Reunion {
    //Collercion<> listaAsistencia = new List<>;
    public List listaAsistencia;
    public Date fecha;
    public String descripcion;
    public int hora;
    public Collection<Contacto> contactos;
    



    public Reunion(List listaAsistencia, Date fecha, String descripcion, int hora) {
        this.listaAsistencia = listaAsistencia;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.hora = hora;
    }


    public List getListaAsistencia() {
        return listaAsistencia;
    }

    public void setListaAsistencia(List listaAsistencia) {
        this.listaAsistencia = listaAsistencia;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void agregarContacto(Contacto contacto) {
        if (!verificarEstudiante(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        }
    }

    public boolean verificarContacto(String nombre, String telf) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telf)) {
                 centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarEstudiante(String nombre, String telf) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telf)) {
                contactos.remove(contacto);
                break;
            }
        }
    }



}
