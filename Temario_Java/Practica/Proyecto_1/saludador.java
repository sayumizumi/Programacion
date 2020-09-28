import java.util.Scanner;

/**
 * saludador
 */
import java.util.*;

public class saludador {

    public static void main(String[] args) {
        // ----variables
        String saludo, saludo_F = "Bienvenida Mrs.", saludo_M = "Bienvenido Mr.", nombre, genero;
        Scanner sc = new Scanner(System.in);
        int edad;

        // ----
        System.out.println("Dime tu nombre");
        nombre = sc.next();

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        System.out.println("Eres bro o gurl");
        genero = sc.next();
        if (genero == "bro") {
            System.out.println(saludo_M + nombre + ". Edad:" + edad);

        } else if (genero == "gurl") {
            System.out.println(saludo_F + nombre + ". Edad:" + edad);

        } 
        else System.out.println("no puedes ser tan vergas");

        // ----
        // System.out.println("Hola " + nombre + ". Edad: " + edad + ". Bienvenido/a");

    }
}