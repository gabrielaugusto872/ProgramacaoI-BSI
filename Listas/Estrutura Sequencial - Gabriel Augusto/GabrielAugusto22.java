import java.util.Scanner;

public class GabrielAugusto22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a, b, temporario;

        System.out.printf("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.printf("Digite o valor de B: ");
        b = teclado.nextDouble();

        temporario = a;
        a = b;
        b = temporario;

        System.out.printf("A: %.1f\nB: %.1f", a, b);
    }
}
