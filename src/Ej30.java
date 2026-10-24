import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        numero++;
        numero++;
        numero++;

        System.out.println("Valor final tras incrementarlo tres veces: " + numero);

        String mensaje = (numero % 2 == 0) ? "El número resultante es PAR." : "El número resultante es IMPAR.";

        System.out.println(mensaje);

        sc.close();
    }
}
