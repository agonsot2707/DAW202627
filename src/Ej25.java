import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        double resultado = (double) numero / 2;

        System.out.println("El resultado de dividir " + numero + " entre 2 como real es: " + resultado);

        sc.close();
    }
}