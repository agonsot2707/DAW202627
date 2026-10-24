import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int valorAbsoluto = (numero >= 0) ? numero : -numero;

        System.out.println("El valor absoluto es: " + valorAbsoluto);

        sc.close();
    }
}
