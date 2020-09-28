/**
 * calculadora
 */
import java.util.*;

public class calculadora {

    public static void main(String[] args) {
        // variables
        //String numero_1, numero_2;
        int n1, n2, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        n1 = sc.nextInt();

        System.out.println("Dime el segundo numero");
        n2 = sc.nextInt();

        resultado = n1 + n2;

        System.out.println("Resultado = " + resultado);
    }
}