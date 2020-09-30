
// Necesitamos hacer una puerta con contraseña, al iniciar el programa se nos pedirá introducir una contraseña.
// una vez introducida, se nos mostraran dos opciones (1. cambiar contraseña, 2. cerrar puerta). En la primera opción
// se nos pedira la contraseña actual y luego la nueva. En la segunda opción se cerrara el programa
import java.util.*;

/**
 * puerta
 */
public class puerta {

    public static void main(String[] args) {

        // variables
        String contraseña, nuevacontraseña;
        Scanner sc = new Scanner(System.in);
        int seleccion;

        System.out.println("Dime la contra");
        contraseña = sc.next();
        if (contraseña == "soyadmin") {
            System.out.println("eeeee wachon q quieres hacer");
            System.out.println("1. Cambiar contraseña");
            System.out.println("2. Cerrar esta movida");
            seleccion = sc.nextInt();
            if (seleccion == 1) { System.out.println("pos dime una nueva");
            sc.next();
                
            }

        } else {
            System.out.println("te mamaste bro esa no es");

        }

    }
}