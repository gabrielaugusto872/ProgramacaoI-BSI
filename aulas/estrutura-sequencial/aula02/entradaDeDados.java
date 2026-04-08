/*
Bloco de comentários
*/

import java.util.Scanner; //Classe para entrada de dados.

public class entradaDeDados {
   public static void main (String []args){
      byte idade;
      int filhos;
      String nome, sobrenomes;
      
      Scanner entrada = new Scanner(System.in); //Declara a entrada de dados.
      
      System.out.println("Digite o seu primeiro nome: ");
      nome = entrada.next();
      entrada.nextLine();
      
      System.out.println("Digite o restante do seu nome: ");
      sobrenomes = entrada.nextLine();
      
      System.out.println("Digite a sua idade:");
      idade = entrada.nextByte();
      
      System.out.println("Digite a quantidade de filhos:");
      filhos = entrada.nextInt();
      
      System.out.println(" ");
      System.out.println("           CADASTRO");
      System.out.println("Nome: " + nome + " " + sobrenomes);
      System.out.println("Idade: " + idade + " anos");
      System.out.println("Filhos: " + filhos);
      
      
      
   }
}