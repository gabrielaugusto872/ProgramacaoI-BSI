import java.util.Scanner;

public class GabrielAugusto18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final double valorkw = 0.20, desconto = 0.15;
        double salariominimo, consumoKw, pagoKw, pagoConsumo, pagComDesconto;

        System.out.printf("Digite o valor do salário mínimo: R$ ");
        salariominimo = teclado.nextDouble();
        System.out.printf("Digite a quantidade de quilowatt consumida: ");
        consumoKw = teclado.nextDouble();

        pagoKw = salariominimo * valorkw;
        pagoConsumo = pagoKw * consumoKw;
        pagComDesconto = pagoConsumo - (pagoConsumo * desconto);

        System.out.printf("Valor pago por Quilowatt: R$ %.2f\n", pagoKw);
        System.out.printf("Valor a ser pago por consumo na residência: R$ %.2f\n", pagoConsumo);
        System.out.printf("Valor a ser pago considerando o desconto: R$ %.2f", pagComDesconto);
    }
}
