package co.edu.uniquindio.poo;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        menu();
    }

    public static void menu (){
        Scanner scanner = new Scanner(System.in);
        boolean centinela = true;
        while (centinela) {
            System.out.println("Que quieres hacer hoy: ");
            System.out.println("1. Gestionar Contactos: ");
            System.out.println("2. Gestionar Grupos: ");
            System.out.println("3. Gestionar Reuniones: ");
            System.out.println("4. Salir");
            int opcion  = scanner.nextInt();
            centinela = redireccion(opcion);

        }

    }

    public static boolean redireccion(int operacion) {
        switch (operacion) {
            case 1:
                //Contacto.menuContacto();
                break;
            case 2:
                //Grupo.menuGrupo();
                break;
            case 3:
                //Reunion.menuReunion();
                break;
            case 4:
                return false;
        }
        return true;
    }
}
