import  java.util.*;

public class GabrielAugusto12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int diaVoto, mesVoto, anoVoto, diaNascimento, mesNascimento, anoNascimento, idade;

        System.out.printf("Digite a data de votação:\n");
        System.out.printf("Dia: ");
        diaVoto = teclado.nextInt();
        System.out.printf("Mês: ");
        mesVoto = teclado.nextInt();
        System.out.printf("Ano: ");
        anoVoto = teclado.nextInt();

        System.out.printf("\nDigite a data de nascimento do eleitor:\n");
        System.out.printf("Dia: ");
        diaNascimento = teclado.nextInt();
        System.out.printf("Mês: ");
        mesNascimento = teclado.nextInt();
        System.out.printf("Ano: ");
        anoNascimento = teclado.nextInt();

        idade = anoVoto - anoNascimento;

        if(mesVoto < mesNascimento){
            idade = idade - 1;
        } else {
            if (mesVoto == mesNascimento){
                if(diaVoto < diaNascimento){
                    idade = idade - 1;
                }
            }
        }

        System.out.printf("Idade no dia da eleição: %d\n", idade);

        if(idade < 16){
            System.out.printf("Não vota.\n");
        } else if (idade < 19 || idade > 70){
            System.out.printf("Voto Facultativo.\n");
        } else {
            System.out.printf("Voto Obrigatório.\n");
        }

        
    }
}
