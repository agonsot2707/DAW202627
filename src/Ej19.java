import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota 1 (0.0 a 10.0): ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la nota 2 (0.0 a 10.0): ");
        double nota2 = sc.nextDouble();
        System.out.print("Introduce la nota 3 (0.0 a 10.0): ");
        double nota3 = sc.nextDouble();
        System.out.print("Introduce la nota 4 (0.0 a 10.0): ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        long notaRedondeada = Math.round(media);

        System.out.println("La nota media redondeada es: " + notaRedondeada);

        sc.close();
    }
}
