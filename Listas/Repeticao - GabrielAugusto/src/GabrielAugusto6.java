import java.util.*;

public class GabrielAugusto6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, media;
        int num;

        System.out.printf("Digite o valor de N: ");
        num = sc.nextInt();

        for(int i=0;i<num;i++){
            soma = soma + (i + 1);
        }
        media = soma / num;
        System.out.println(media);
    }
}
