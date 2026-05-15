import java.util.*;

public class GabrielAugustoAninhada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int senha;

        System.out.printf("Digite o nome de usuário: ");
        nome = sc.next();
        System.out.printf("Digite a senha: ");
        senha = sc.nextInt();

        if(nome.equals("admin")){
            if(senha == 12345){
                System.out.printf("Acesso concedido. Bem vindo, admin!");
            } else {
                System.out.printf("Senha incorreta.");
            }
        } else {
            System.out.printf("Usuário não encontrado.");
        }
    }
}
