import java.util.Scanner;
public class entrada02 {
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      int N, antecessor, sucessor;
      
      System.out.println("Digite o seu numero: ");
      N = teclado.nextInt();
      
      antecessor = N - 1;
      sucessor = N + 1;
      
      System.out.println("Numero: " + N);
      System.out.printf("Antecessor: %d\n", antecessor);
      System.out.println("Sucessor: " + sucessor);
   }
}