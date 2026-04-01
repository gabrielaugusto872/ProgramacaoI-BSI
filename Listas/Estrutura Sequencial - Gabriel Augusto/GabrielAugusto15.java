import java.util.Scanner;

public class GabrielAugusto15 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final double PI = 3.1416;
        double raio, circunferencia;

        System.out.printf("Digite o valor do raio: ");
        raio = teclado.nextDouble();

        circunferencia = 2 * PI * raio;

        System.out.printf("Circinferência: %.2f", circunferencia);
    }
}
