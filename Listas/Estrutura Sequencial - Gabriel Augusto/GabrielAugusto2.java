import java.util.Scanner;

public class GabrielAugusto2{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      int N, antecessor, sucessor;
      
      System.out.printf("Digite o seu numero: ");
      N = teclado.nextInt();
      
      antecessor = N - 1;
      sucessor = N + 1;
      
      System.out.printf("Antecessor: %d\n", antecessor);
      System.out.printf("Sucessor: %d\n", sucessor);
   }
}
