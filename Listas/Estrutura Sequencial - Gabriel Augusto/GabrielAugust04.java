import java.util.Scanner;

public class GabrielAugust04{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      double nota1, nota2, nota3, peso1, peso2, peso3, media;
      
      System.out.printf("Digite a primeira nota: ");
      nota1 = teclado.nextDouble();
      System.out.printf("Digite o peso desta nota: ");
      peso1 = teclado.nextDouble();
      nota1 = peso1 * nota1;
        
      System.out.printf("Digite a segunda nota: ");
      nota2 = teclado.nextDouble();
      System.out.printf("Digite o peso desta nota: ");
      peso2 = teclado.nextDouble();
      nota2 = peso2 * nota2;
      
      System.out.printf("Digite a terceira nota: ");
      nota3 = teclado.nextDouble();
      System.out.printf("Digite o peso desta nota: ");
      peso3 = teclado.nextDouble();
      nota3 = peso3 * nota3;
      
      media = (nota1 + nota2 + nota3) / (peso1 + peso2 + peso3);
      
      System.out.printf("Media: %.2f", media);
   }
}