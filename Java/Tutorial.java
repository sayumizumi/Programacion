
// comentario simple
/*
comentario en bloque
*/
import java.util.*;

public class Tutorial { // Las clases, son las carpetas primitivas

    public static void main(String[] args) { // Funcion principal o main class. Desde aqui se ejecuta el programa.

        Perro perro_1 = new Perro("Rocky", "Pastor Aleman", 13);
       Perro perro_2 = new Perro("Dama", "Palleiro", 7);

        perro_1.presentacion();
        perro_2.presentacion();
    }

    public static void Saludito() {

        Scanner sc = new Scanner(System.in); // Crear entrada de teclado
        String saludo, saludo_F = "Hola, Mrs. ", saludo_M = "Hola,Mr. ", nombre; // Strings, cadenas de texto.
        int edad, genero_num; // int o Integers, numeros enteros.
        boolean genero; // boolean, si o no, la verdad absoluta de todo.

        // Preguntas al usuario
        System.out.println("Are you a boy or a girl?");
        System.out.println("1. Boy.");
        System.out.println("2. Girl.");

        // Respuesta del usuario
        genero_num = sc.nextInt();
        if (genero_num == 1) {
            genero = false;
        } else {
            genero = true;
        }

        // Relleno
        System.out.println("--------------------------");

        // Preguntamos nombre
        System.out.print("Por favor, digame su nombre:");
        nombre = sc.next();

        System.out.print("Por favor, digame su edad:");
        edad = sc.nextInt();

        // El saludo
        if (!genero) { // Exclamacion es igual a hacer n't // Osea que niegas
            saludo = saludo_M;
        } else {
            saludo = saludo_F;
        }

        // Lanzamos el saludo
        System.out.println(saludo + nombre + ". Edad:" + edad);

    }

}
