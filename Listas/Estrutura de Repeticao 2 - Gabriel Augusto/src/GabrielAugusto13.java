import java.util.*;

public class GabrielAugusto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, contagem = 0;

        System.out.printf("Digite o número: ");
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            if (num % i == 0){
                contagem ++;
            }
        }
        if(contagem < 3){
            System.out.printf("%d é um número primo!", num);
        } else {
            System.out.printf("%d não é um número primo!", num);
        }
    }
}