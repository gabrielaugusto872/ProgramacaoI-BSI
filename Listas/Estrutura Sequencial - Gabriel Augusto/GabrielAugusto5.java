import java.util.Scanner;

public class GabrielAugusto5{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      double salarioBase, gratificacao, imposto, salarioFinal;
      
      System.out.printf("Digite o salario base: ");
      salarioBase = teclado.nextDouble();
      
      gratificacao = salarioBase * 0.10;
      imposto = (salarioBase + gratificacao) * 0.05;
      salarioFinal = salarioBase + gratificacao - imposto;
      
      System.out.printf("Salario a receber: R$ %.2f\n", salarioFinal);
   }
}