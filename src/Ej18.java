import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número real: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número real: ");
        double num2 = sc.nextDouble();
        System.out.print("Introduce el tercer número real: ");
        double num3 = sc.nextDouble();

        double suma = num1 + num2 + num3;
        int sumaEntera = (int) suma;

        System.out.println("La suma sin decimales es: " + sumaEntera);

        sc.close();
    }
}
