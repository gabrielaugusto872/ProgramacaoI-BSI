import java.util.*;

public class GabrielAugusto11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alunos;
        double maior = 0, menor = 0, nota, soma = 0, media;
        String nome, nomeMaior = "", nomeMenor = "";

        System.out.printf("Digite a quantidade de alunos: ");
        alunos = sc.nextInt();

        for(int i=0;i<alunos;i++){
            System.out.println("Digite o nome do " + (i+1) + "° aluno: ");
            nome = sc.next();
            System.out.println("Digite a nota do " + (i+1) + "° aluno: ");
            nota = sc.nextDouble();

            if(i == 0){
                maior = nota;
                menor = nota;
                nomeMaior = nome;
                nomeMenor = nome;
            } else {
                if(nota > maior){
                    maior = nota;
                    nomeMaior = nome;
                }
                if (nota < menor){
                    menor = nota;
                    nomeMenor = nome;
                }
            }

            soma += nota;
        }

        media = soma / alunos;

        System.out.printf("Maior nota: %s, %.2f pontos\nMenor nota: %s, %.2f pontos\n", nomeMaior, maior, nomeMenor, menor);
        System.out.printf("Soma: %.0f\nMédia: %.2f", soma, media);

    }
}
