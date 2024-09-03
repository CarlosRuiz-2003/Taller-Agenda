package co.edu.uniquindio.poo;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;


//Clase para la creacion de reuniones
public class Reunion {
    public Date fecha;
    public String descripcion;
    public String hora;
    public Collection <Contacto> listaAsistencia;
    public Collection <Reunion> reuniones;
    


    //Metodo costructor de la clase Reunion
    public Reunion(Collection<Contacto> listaAsistencia, Date fecha, String descripcion, String hora) {
        this.listaAsistencia = listaAsistencia;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.hora = hora;
    }


    public Collection<Contacto> getListaAsistencia() {
        return listaAsistencia;
    }

    public void setListaAsistencia(Collection<Contacto> listaAsistencia) {
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


    //Metodo para agregar reuniones
    public void CrearReuniones(int limite) {
        Date fecha = new Date();
        DateFormat dateFormat = new SimpleDateFormat();
        String hora = Integer.toString(locaDate.getHour());
        System.out.println("Descripcion de la reunion: ");
        String descripcion  = scanner.nextLine();
        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el nombre del contacto: ");
            String nombre  = scanner.nextLine();
            //System.out.println("Ingrese el telefono del contacto: ");
            //String telefono  = scanner.nextLine();
            ArrayList list = new ArrayList<>();
            lista.add(nombre);
            if (!Contacto.verificarContacto(nombreM, telefonoM)) {
            }
        }
        Reunion reunion = new Reunion(lista, fecha, descripcion, hora);
        reunion.add(contacto);
        System.out.println("El contacto se agrego");

    }

    //Metodo para eliminar los reuniones
    public void eliminarReunion(String descripcion) {
        for (Reunion reunion : reuniones) {
            if (reunion.getDescripcion().equals(descripcion)) {
                reuniones.remove(reunion);
                break;
            }
        }
    }

    // //Metodo para verificar que no se repitan los contactos
    // public boolean verificarContacto(String nombre, String telf) {
    //     boolean centinela = false;
    //     for (Contacto contacto : contactos) {
    //         if (contacto.getNombre().equals(nombre) && contacto.getTelf().equals(telf)) {
    //              centinela = true;
    //         }
    //     }
    //     return centinela;
    // }
    // }

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
