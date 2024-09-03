package co.edu.uniquindio.poo;

import java.util.Collection;



public class Contacto {
    public String nombre;
    public String alias;
    public String direccion;
    public String telefono;
    public String email;
    public Collection<Contacto> contactos;
    
    //Metodo constructor de la clase
    public Contacto(String nombre,String alias, String direccion, String telefono, String email){
        this.nombre=nombre;
        this.alias=alias;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getDirec() {
        return direccion;
    }
    public void setDireccion(String direc) {
        this.direccion = direc;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telf) {
        this.telefono = telf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Contacto> getListContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direccion=" + direccion+" , telefono=" + telefono + ", email=" + email + "]";
    }

    //Metodo para agregar los contactos
    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
        } else {
            System.out.println("El contacto esta repetido.");
        }
    }
   
    //Metodo para eliminar los contactos
    public void eliminarContacto(Contacto contacto) {
        if (contactos.contains(contacto)) {
            contactos.remove(contacto);
            System.out.println("El contacto se elimino");
        }
    }

    //Metodo para verificar que los contactos no esten repetidos
    public boolean verificarContacto(String nombre, String telf) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telf)) {
                centinela = true;
            }
        }
        return centinela;
    }
}

