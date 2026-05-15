import java.util.*;

public class GabrielAugusto10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0, num, quantidade;

        System.out.printf("Digite a quantidade de números: ");
        quantidade = sc.nextInt();

        for(int i=0;i<quantidade;i++){
            System.out.printf("Digite o " + (i+1) + "° número: ");
            num = sc.nextInt();

            if(i == 0){
                maior = num;
                menor = num;
            } else {
                if(num > maior){
                    maior = num;
                }
                if (num < menor){
                    menor = num;
                }
            }
        }
        System.out.printf("Maior: %d\nMenor: %d", maior, menor);
    }
}
