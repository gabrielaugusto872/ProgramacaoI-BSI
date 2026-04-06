import java.util.Scanner;

public class GabrielAugusto21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double angulo, altura, escada;

        System.out.printf("Digite o valor do ângulo: ");
        angulo = teclado.nextDouble();
        angulo = Math.toRadians(angulo);
        System.out.printf("Digite o valor da altura da parede: ");
        altura = teclado.nextDouble();

        escada = altura / Math.sin(angulo);

        System.out.printf("Medida da escada: %.2f", escada);
    }
}
