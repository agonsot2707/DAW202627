import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        boolean enRango = (numero >= 0) && (numero <= 100);

        if (enRango) {
            System.out.println("El número " + numero + " SÍ está dentro del rango 0–100.");
        } else {
            System.out.println("El número " + numero + " NO está dentro del rango 0–100.");
        }

        sc.close();
    }
}