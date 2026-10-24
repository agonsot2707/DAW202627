public class Ej29 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        boolean resultado = (a + b * 2) > c || (c / a) < b;

        System.out.println("Resultado de la expresión: " + resultado);
    }
}