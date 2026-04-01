import java.util.Scanner;

public class GabrielAugusto6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double salarioFixo, valorVendas, comissao, salarioFinal;

        System.out.printf("Digite o valor do salário fixo: ");
        salarioFixo = teclado.nextDouble();

        System.out.printf("Digite o valor de vendas  realizadas: ");
        valorVendas = teclado.nextDouble();

        comissao = valorVendas * 0.04;
        salarioFinal = salarioFixo + comissao;

        System.out.printf("O funcionário deve receber R$ %.2f.", salarioFinal);
    }
}
