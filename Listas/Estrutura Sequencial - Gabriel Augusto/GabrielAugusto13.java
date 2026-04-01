import java.util.Scanner;

public class GabrielAugusto13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final int inicio = 1930, guerras = 2;
        int anoAtual, copas;

        System.out.printf("Digite o ano atual: ");
        anoAtual = teclado.nextInt();

        copas = ((anoAtual - inicio) / 4) + 1;
        copas = copas - guerras;

        System.out.printf("Copas realizadas: %d", copas);
    }
}
