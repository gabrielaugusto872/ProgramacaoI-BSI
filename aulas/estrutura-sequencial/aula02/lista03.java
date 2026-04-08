import java.util.Scanner;
public class lista03{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      int N1, N2, N3;
      float resultado;
      
      System.out.println("Digite o primeiro numero: ");
      N1 = teclado.nextInt();
      System.out.println("Digite o segundo numero: ");
      N2 = teclado.nextInt();
      System.out.println("Digite o terceiro numero: ");
      N3 = teclado.nextInt();
     
      resultado = (N1 * N2)/(float) N3;
      
      System.out.printf("Resultado: %.2f", resultado);
   }
}