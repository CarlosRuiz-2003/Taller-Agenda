package co.edu.uniquindio.poo;


import java.util.ArrayList;
import java.util.Collection;

public class Grupo {
    public String nombre;
    public Categoria categoria;
    public Collection<Contacto> contactos;


    public Grupo (String nombre, Categoria categoria){
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getcategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos + "]";
    }


    //Metodo enum para crear las diferentes categorias de los grupos
    public enum Categoria {
        OFICINA,
        FIESTA,
        AMIGOS,
        FAMILIA
    }

    //Metodo para agregar los contactos al grupo
    public void agregarGrupoContacto(Contacto contacto) {
        if (contactos.size() < 5) {
            contactos.add(contacto);
        } else {
            System.out.println("El grupo excedio el numero de contactos (5).");
        }
    }

    //Metodo para eliminar los contactos del grupo
    public void eliminarGrupoContacto(Contacto contacto) {
        if (contactos.contains(contacto)) {
            contactos.remove(contacto);
        } else {
            System.out.println("El contacto se elimino del grupo.");
        }
    }
}
    




