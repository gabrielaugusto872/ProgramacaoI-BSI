import java.util.*;

public class GabrielAugusto8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int num;

        System.out.printf("Digite o valor de N: ");
        num = sc.nextInt();

        for(int i=0;i<num;i++){
            if(i % 2 == 0){
                soma += 1.0/(i+1);
            } else {
                soma -= 1.0/(i+1);
            }
        }
        System.out.printf("%.2f", soma);
    }
}
