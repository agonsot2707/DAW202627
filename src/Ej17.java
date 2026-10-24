import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el importe de la compra (€): ");
        double importe = sc.nextDouble();

        double precioFinal = (importe > 100) ? importe * 0.80 : importe;

        System.out.println("El precio final es: " + precioFinal + " €");

        sc.close();
    }
}