import java.util.*;

public class GabrielAugusto7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int num;

        System.out.printf("Digite o valor de N: ");
        num = sc.nextInt();

        for(int i=0;i<num;i++){
            soma = soma + (1.0/(i+1));
        }
        System.out.printf("%.2f", soma);
    }
}
