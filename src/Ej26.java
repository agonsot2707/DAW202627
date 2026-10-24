public class Ej26 {
    public static void main(String[] args) {
        double saldo = 100.0;
        System.out.println("Saldo inicial: " + saldo + " €");

        saldo += 50;
        System.out.println("Después de añadir 50 €: " + saldo + " €");

        saldo -= 20;
        System.out.println("Después de restar 20 €: " + saldo + " €");

        saldo *= 2;
        System.out.println("Después de duplicar: " + saldo + " €");

        saldo /= 4;
        System.out.println("Después de dividir entre 4: " + saldo + " €");
    }
}