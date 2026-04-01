import java.util.Scanner;

public class GabrielAugusto11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double salario, conta1, conta2, restante;

        System.out.printf("Digite o valor do salário recebido: R$ ");
        salario = teclado.nextDouble();
        System.out.printf("Digite o valor da primeira conta: R$ ");
        conta1 = teclado.nextDouble();
        System.out.printf("Digite o valor da segunda conta: R$ ");
        conta2 = teclado.nextDouble();

        conta1 = conta1 + (conta1 * 0.02);
        conta2 = conta2 + (conta2 * 0.02);

        restante = salario - (conta1 + conta2);

        System.out.printf("Restará: R$ %.2f", restante);
    }
}
