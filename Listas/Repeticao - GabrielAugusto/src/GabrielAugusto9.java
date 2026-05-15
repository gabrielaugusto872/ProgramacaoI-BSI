import java.util.*;

public class GabrielAugusto9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, media;
        int quantidade, num;

        System.out.printf("Digite a quantidade de números: ");
        quantidade = sc.nextInt();

        for(int i=0;i<quantidade;i++){
            System.out.printf("Digite o " + (i+1) + "° número: ");
            num = sc.nextInt();

            soma += num;
        }
        media = soma / quantidade;
        System.out.printf("Média: %.2f", media);
    }
}
