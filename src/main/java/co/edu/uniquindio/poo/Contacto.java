package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Scanner;

public class Contacto {
    public String nombre;
    public String alias;
    public String direccion;
    public String telefono;
    public String email;
    public Collection<Contacto> contactos;
    

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

    
    public void agregarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del contacto: ");
        String nombre  = scanner.nextLine();
        System.out.println("Alias del contacto: ");
        String alias  = scanner.nextLine();
        System.out.println("Direccion del contacto: ");
        String direccion  = scanner.nextLine();
        System.out.println("Telefono del contacto: ");
        String telefono  = scanner.nextLine();
        System.out.println("Email del contacto: ");
        String email  = scanner.nextLine();
        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);
        if (!verificarContacto(contacto.getNombre(), contacto.getTelefono())) {
            contactos.add(contacto);
            System.out.println("El contacto se agrego");
        }
    }

    public void ModificarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto a Actualizar: ");
        String nombreM  = scanner.nextLine();
        System.out.println("Ingrese el telefono del contacto a Actualizar: ");
        String telefonoM  = scanner.nextLine();

        if (!verificarContacto(nombreM, telefonoM)) {
            for (Contacto contacto : contactos) {
                if (contacto.getNombre().equals(nombreM) && contacto.getTelefono().equals(telefonoM)) {
                    System.out.println("Ingrese el nuevo nombre del contacto : ");
                    String nombre  = scanner.nextLine();
                    contacto.setNombre(nombre);
                    System.out.println("Ingrese el nuevo alias del contacto: ");
                    String alias  = scanner.nextLine();
                    contacto.setNombre(alias);
                    System.out.println("Ingrese la nueva direccion del contacto: ");
                    String direccion  = scanner.nextLine();
                    contacto.setNombre(direccion);
                    System.out.println("Ingrese el nuevo telefono del contacto: ");
                    String telefono  = scanner.nextLine();
                    contacto.setNombre(telefono);
                    System.out.println("Ingrese el nuevo email del contacto: ");
                    String email  = scanner.nextLine();
                    contacto.setNombre(email);
                    System.out.println("El contacto se actualizo");
                }
            }
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

    //Metodo para eliminar los contactos
    public void eliminarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        String nombre  = scanner.nextLine();
        System.out.println("Ingrese el telefono del contacto a eliminar: ");
        String telefono  = scanner.nextLine();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                contactos.remove(contacto);
                System.out.println("El contacto se elimino");
                break;
            }
        }
    }

    public static void menuContacto (){
        Scanner scanner = new Scanner(System.in);
        boolean centinela = true;
        while (centinela) {
            System.out.println("Que quieres hacer en Contactos: ");
            System.out.println("1. Crear un Contacto: ");
            System.out.println("2. Modificar un Contacto: ");
            System.out.println("3. Eliminar un Contacto: ");
            System.out.println("4. Salir");
            int opcion  = scanner.nextInt();
            centinela = redireccion(opcion);

        }
    }

    public static boolean redireccion(int operacion) {
        switch (operacion) {
            case 1:
                agregarContacto();
                break;
            case 2:
                //Grupo.menuGrupo();
                break;
            case 3:
                eliminarContacto();
                break;
            case 4:
                return false;
        }
        return true;
    }
}

