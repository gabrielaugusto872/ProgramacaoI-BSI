import java.util.*;

public class GabrielAugusto6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double antigoSalario, novoSalario, aumento;

        System.out.printf("Digite o valor do salário: R$ ");
        antigoSalario = teclado.nextDouble();

        if(antigoSalario < 700){
            aumento = antigoSalario * 0.3;
        } else {
            aumento = antigoSalario * 0.1;
        }

        novoSalario = antigoSalario + aumento;
        System.out.printf("Novo salário: R$ %.2f", novoSalario);
    }
}
