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
    


    //Costructor de la clase Reunion
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

    //Metodo para agregar contactos
    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        }
    }

    //Metodo para verificar que no se repitan los contactos
    public boolean verificarContacto(String nombre, String telf) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telf)) {
                 centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarContacto(String nombre, String telf) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telf)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    // public static void menuReunion (){
    //     Scanner scanner = new Scanner(System.in);
    //     boolean centinela = true;
    //     while (centinela) {
    //         System.out.println("Que quieres hacer en la Reunion: ");
    //         System.out.println("1. Crear una Reunion: ");
    //         System.out.println("2. Modificar una Reunion: ");
    //         System.out.println("3. Eliminar una Reunion: ");
    //         System.out.println("4. Salir");
    //         int opcion  = scanner.nextInt();
    //         centinela = redireccion(opcion);

    //     }

    // }



}
