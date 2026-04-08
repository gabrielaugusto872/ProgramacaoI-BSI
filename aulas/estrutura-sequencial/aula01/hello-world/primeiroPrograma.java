public class primeiroPrograma{
   public static void main(String []args){
      final double impostos = 800.32;
   
      byte idade = 23;
      short disciplinas;
      int filhos;
      long contas;
      
      float valorEmConta;
      
      boolean casado = false;
      
      char letra = 'a';
      String nome = "Gabriel Augusto";
      
      disciplinas = 5;
      filhos = 2;
      contas = 4;
      
      valorEmConta = 1580.5f;
      
      System.out.println("Me chamo " + nome);
      System.out.println("Tenho " + idade + " anos.");
      System.out.println("Estou cursando " + disciplinas + " disciplinas.");
      System.out.println("Tenho " + filhos + " filho(s).");
      System.out.println("E possuo " + contas + " conta(s) de email.");
      
      System.out.printf("Tenho R$ %.2f em conta e pago R$ %.2f de impostos.\n", valorEmConta, impostos);
      
      System.out.println("Status de casado: " + casado);
      
      System.out.printf("Letra: " + letra + "\n");
   }
}

