import java.util.Scanner;

public class GabrielAugusto19 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBase, tempoServico, imposto, gratificacao, salarioLiquido, categoria;

        System.out.printf("Digite o salário base: ");
        salarioBase = sc.nextDouble();
        System.out.printf("Digite o tempo de serviço: ");
        tempoServico = sc.nextDouble();

        if(salarioBase < 200){
            imposto = 0;
            System.out.printf("Imposto: Insento\n");
        } else if(salarioBase <= 450){
            imposto = 3;
            System.out.printf("Imposto: %.0f%%\n", imposto);
        } else if(salarioBase < 700){
            imposto = 8;
            System.out.printf("Imposto: %.0f%%\n", imposto);
        } else {
            imposto = 12;
            System.out.printf("Imposto: %.0f%%\n", imposto);
        }

        if(salarioBase > 500){
            if(tempoServico <= 3){
                gratificacao = 20;
                System.out.printf("Gratificação: %.0f%%\n", gratificacao);
            } else {
                gratificacao = 30;
                System.out.printf("Gratificação: %.0f%%\n", gratificacao);
            }
        } else {
            if(tempoServico <= 3){
                gratificacao = 23;
                System.out.printf("Gratificação: %.0f%%\n", gratificacao);
            } else if(tempoServico < 6){
                gratificacao = 35;
                System.out.printf("Gratificação: %.0f%%\n", gratificacao);
            } else {
                gratificacao = 33;
                System.out.printf("Gratificação: %.0f%%\n", gratificacao);
            }
        }
        imposto = imposto / 100;
        gratificacao = gratificacao / 100;

        salarioLiquido = salarioBase - (imposto * salarioBase) + (gratificacao * salarioBase);
        System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);

        if(salarioLiquido <= 350){
            System.out.printf("Categoria: A\n");
        } else if(salarioLiquido < 600){
            System.out.printf("Categoria: B\n");
        } else {
            System.out.printf("Categoria: C\n");
        }
    }
}
