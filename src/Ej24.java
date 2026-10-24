import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo (entero): ");
        int a = sc.nextInt();
        System.out.print("Introduce el divisor (entero): ");
        int b = sc.nextInt();

        int divisionEntera = a / b;
        double divisionReal = (double) a / b;

        System.out.println("División entera: " + divisionEntera);
        System.out.println("División real: " + divisionReal);

        sc.close();
    }
}