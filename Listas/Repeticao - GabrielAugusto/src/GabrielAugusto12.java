import java.util.*;

public class GabrielAugusto12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroVeiculos, numeroAcidentes;
        double maior = 0, menor = 0, menor200 = 0, somaVeiculos = 0, somaAcidentes = 0, mediaVeiculos, mediaAcidentes, acidentesPorVeiculos;
        String nome, nomeMaior = "", nomeMenor = "";

        for(int i=0;i<5;i++){
            System.out.println("Digite o nome da " + (i+1) + "° cidade: ");
            nome = sc.nextLine();
            System.out.println("Digite o número de veículos da cidade: ");
            numeroVeiculos = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o número de acidentes na cidade: ");
            numeroAcidentes = sc.nextInt();
            sc.nextLine();

            if(i == 0){
                maior = numeroAcidentes;
                menor = numeroAcidentes;
                nomeMaior = nome;
                nomeMenor = nome;
            } else {
                if(numeroAcidentes > maior){
                    maior = numeroAcidentes;
                    nomeMaior = nome;
                }
                if (numeroAcidentes < menor){
                    menor = numeroAcidentes;
                    nomeMenor = nome;
                }
            }

            if (numeroVeiculos < 200){
                somaAcidentes += numeroAcidentes;
                menor200 += 1;
            }
            somaVeiculos += numeroVeiculos;

            acidentesPorVeiculos = (double)numeroAcidentes / numeroVeiculos;
            System.out.printf("Acidentes por veículos na cidade %s: %.2f\n", nome,acidentesPorVeiculos);
        }

        mediaVeiculos = somaVeiculos / 5;
        mediaAcidentes = somaAcidentes / menor200;


        System.out.printf("Maior índice de acidentes: %s, %.2f acidentes\nMenor índice de acidentes: %s, %.2f acidentes\n", nomeMaior, maior, nomeMenor, menor);
        System.out.printf("Média de veículos nas 5 cidades: %.2f\n", mediaVeiculos);
        if (menor200 > 0){
            System.out.printf("Média de acidentes nas cidades com menos de 200 veículos: %.2f", mediaAcidentes);
        } else {
            System.out.printf("Nenhuma cidade com menos de 200 veiculos");

        }

    }
}
