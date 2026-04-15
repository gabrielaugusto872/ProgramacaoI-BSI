import  java.util.*;

public class GabrielAugusto12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean teste = false;
        int tamanho;
        String dataVotacao, nascimento, voto;

        System.out.printf("\nFormato necessário para entrada de datas:\n");
        System.out.printf("DD/MM/AAAA\n");

        while (!teste){
            System.out.printf("\nDigite a data de votação: ");
            dataVotacao = teclado.next();

            tamanho = dataVotacao.length();

            if(tamanho < 10 || dataVotacao.charAt(2) != '/' || dataVotacao.charAt(5) != '/'){
                System.out.printf("Formato da data inválido!\n");
            } else {
                teste = true;
            }
        }

        teste = false;

        while (!teste){
            System.out.printf("\nDigite a data de nascimento do eleitor: ");
            nascimento = teclado.next();

            tamanho = nascimento.length();
            
            if(tamanho < 101 || nascimento.charAt(2) != '/' || nascimento.charAt(5) != '/'){
                System.out.printf("Formato da data inválido!\n");
            } else {
                teste = true;
            }
        }

        
    }
}
