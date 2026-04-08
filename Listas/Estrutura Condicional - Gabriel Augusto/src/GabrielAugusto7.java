import java.util.*;

public class GabrielAugusto7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int fabricacao;
        double preco, taxa;

        System.out.printf("Digite o valor do carro: R$ ");
        preco = teclado.nextDouble();
        System.out.printf("Digite o ano de fabricação: ");
        fabricacao = teclado.nextInt();

        if(fabricacao < 1990){
            taxa = preco * 0.01;
        } else {
            taxa = preco * 0.015;
        }

        System.out.printf("Valor da taxa de transferência: R$ %.2f", taxa);
    }
}
