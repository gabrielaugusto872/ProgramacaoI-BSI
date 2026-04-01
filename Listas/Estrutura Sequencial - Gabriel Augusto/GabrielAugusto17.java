import java.util.Scanner;

public class GabrielAugusto17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double num, fracionaria;
        int inteira;

        System.out.printf("Digite um número: ");
        num = teclado.nextDouble();

        inteira = (int)num;
        fracionaria = num - inteira;

        System.out.printf("Parte inteira: %d\n", inteira);
        System.out.printf("Parte fracionária: %.2f", fracionaria);
    }
}
