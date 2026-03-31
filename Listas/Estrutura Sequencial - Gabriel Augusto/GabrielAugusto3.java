import java.util.Scanner;

public class GabrielAugusto3{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      double N1, N2, N3, resultado;
      
      System.out.printf("Digite o primeiro numero: ");
      N1 = teclado.nextDouble();
      System.out.printf("Digite o segundo numero: ");
      N2 = teclado.nextDouble();
      System.out.printf("Digite o terceiro numero: ");
      N3 = teclado.nextDouble();
      
      resultado = (N1 + N2) / N3;
      
      System.out.printf("Resultado: %.2f\m", resultado);
   }
}