import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        int resultadoSuma = num1;
        resultadoSuma += num2;

        int resultadoResta = num1;
        resultadoResta -= num2;

        System.out.println("Resultado de la suma (+=): " + resultadoSuma);
        System.out.println("Resultado de la resta (-=): " + resultadoResta);

        sc.close();
    }
}