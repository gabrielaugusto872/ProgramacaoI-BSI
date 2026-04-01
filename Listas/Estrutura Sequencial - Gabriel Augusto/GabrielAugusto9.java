import java.util.Scanner;

public class GabrielAugusto9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int lados, diagonais;

        System.out.printf("Digite o número de lados do polígono: ");
        lados = teclado.nextInt();

        diagonais = lados*(lados - 3) / 2;

        System.out.printf("Números de diagonais do polígono: %d", diagonais);
    }
}
