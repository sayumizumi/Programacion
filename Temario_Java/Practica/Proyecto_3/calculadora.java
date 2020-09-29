
/**
 * calculadora
 */
import java.util.*;

public class calculadora {

    public static void main(String[] args) {
        // variables
        // String numero_1, numero_2;
        int n1, n2, resultado = 0, operacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona la operación");
        System.out.println("---------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("----------");

        operacion = sc.nextInt();

        System.out.println("Dime el primer numero");
        n1 = sc.nextInt();

        System.out.println("Dime el segundo numero");
        n2 = sc.nextInt();

        if (operacion == 1) {
            resultado = n1 + n2;
        }
       else if (operacion == 2) {
            resultado = n1 - n2;
        }
       else if (operacion == 3) {
            resultado = n1 * n2;
        }
       else if (operacion == 4) {
            resultado = n1 / n2;
        } else {
            System.out.println("pon un numero de verdad bitch");
        }

        System.out.println("Resultado = " + resultado );
    }
}