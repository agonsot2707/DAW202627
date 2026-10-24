import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();

        int x = n;
        System.out.println("Valor inicial: " + x);
        System.out.println("Durante post-incremento (x++): " + (x++));
        System.out.println("Después de post-incremento: " + x);

        x = n;
        System.out.println("Valor inicial: " + x);
        System.out.println("Durante pre-incremento (++x): " + (++x));
        System.out.println("Después de pre-incremento: " + x);

        x = n;
        System.out.println("Valor inicial: " + x);
        System.out.println("Durante post-decremento (x--): " + (x--));
        System.out.println("Después de post-decremento: " + x);

        x = n;
        System.out.println("Valor inicial: " + x);
        System.out.println("Durante pre-decremento (--x): " + (--x));
        System.out.println("Después de pre-decremento: " + x);

        sc.close();
    }
}