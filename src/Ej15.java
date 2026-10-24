import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        boolean esPar = (numero % 2 == 0);

        System.out.println("¿El número es par?: " + esPar);

        sc.close();
    }
}
