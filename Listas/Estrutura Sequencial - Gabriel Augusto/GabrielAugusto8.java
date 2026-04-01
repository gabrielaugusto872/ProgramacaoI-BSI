import java.util.Scanner;

public class GabrielAugusto8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area, valorMedio, valorLote;

        System.out.printf("Digite o valor da base maior: ");
        baseMaior = teclado.nextDouble();
        System.out.printf("digite o valor da base menor: ");
        baseMenor = teclado.nextDouble();
        System.out.printf("Digite o valor da altura: ");
        altura = teclado.nextDouble();
        System.out.printf("Digite o valor médio pago por metro quadrado: ");
        valorMedio = teclado.nextDouble();

        area = ((baseMaior + baseMenor) * 2) / 2;
        valorLote = area * valorMedio;

        System.out.printf("Área do lote: %.0f metros quadrados\nValor médio de venda do lote: R$ %.2f", area, valorLote);
    }
}
