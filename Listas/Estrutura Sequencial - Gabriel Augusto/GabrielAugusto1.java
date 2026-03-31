import java.util.Scanner;
public class GabrielAugusto1 {
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      int N1, N2, N3, soma;
      double media;
      
      System.out.printf("Digite o primeiro numero: ");
      N1 = teclado.nextInt();
      System.out.printf("Digite o segundo numero: ");
      N2 = teclado.nextInt();
      System.out.printf("Digite o terceiro numero: ");
      N3 = teclado.nextInt();
      
      soma = N1 + N2 + N3;
      media = soma / (double) 3;
      
      System.out.printf("Soma: %d\n", soma);
      System.out.printf("Media: %.2f\n", media);
   }
}