package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Grupo.Categoria;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Creacion de contactod
        Contacto contacto1 = new Contacto("Carlos Andres", "andres", "1234", "1234", "carlos@example.com");
        Contacto contacto2 = new Contacto("Alejadro hernandez", "alejo", "12346", "456", "alejandro@example.com");
        Contacto contacto3 = new Contacto("Juan Sebastian", "sebas", "123456", "789", "juan@example.com");

        //Creacion de Grupod
        Grupo grupo1 = new Grupo("Amigos Cercanos", Categoria.AMIGOS);
        grupo1.agregarGrupoContacto(contacto1);
        grupo1.agregarGrupoContacto(contacto2);

        Grupo grupo2 = new Grupo("Familia", Categoria.FAMILIA);
        grupo2.agregarGrupoContacto(contacto3);

        //Creacion de reuniones
        Reunion reunion = new Reunion("2024-09-10","Reunión de Proyecto", "14:00");
        reunion.agregarListaAsistentes(contacto1);


        System.out.println(contacto1);
        System.out.println(grupo1);
        System.out.println(reunion);
    }





    //public static void menu (){
        //Scanner scanner = new Scanner(System.in);
        //boolean centinela = true;
        //while (centinela) {
            //System.out.println("Que quieres hacer hoy: ");
            //System.out.println("1. Gestionar Contactos: ");
            //System.out.println("2. Gestionar Grupos: ");
            //System.out.println("3. Gestionar Reuniones: ");
            //System.out.println("4. Salir");
            //int opcion  = scanner.nextInt();
            //centinela = redireccion(opcion);

        //}

    //}

    //public static boolean redireccion(int operacion) {
        //switch (operacion) {
            //case 1:
                //Contacto.menuContacto();
                //break;
            //case 2:
                //Grupo.menuGrupo();
                //break;
            //case 3:
                //Reunion.menuReunion();
                //break;
            //case 4:
                //return false;
        //}
        //return true;
    //}

    //public static void menuContacto (){
        //Scanner scanner = new Scanner(System.in);
        //boolean centinela = true;
        //while (centinela) {
            //System.out.println("Que quieres hacer en Contactos: ");
            //System.out.println("1. Crear un Contacto: ");
            //System.out.println("2. Modificar un Contacto: ");
            //System.out.println("3. Eliminar un Contacto: ");
            //System.out.println("4. Salir");
            //int opcion  = scanner.nextInt();
            //centinela = redireccion(opcion);
        //}
    //}
}
