import java.util.*;

public class GabrielAugusto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, ultimoNum = 1, penultimoNum = 1, soma;

        System.out.printf("Digite o valor de N: ");
        n = sc.nextInt();



        for(int i=0;i<n;i++){
            if(i < 2){
                System.out.printf("1, ");
            } else {
                soma = ultimoNum + penultimoNum;

                if(i < (n-1)){
                    System.out.printf("%d, ", soma);
                } else {
                    System.out.printf("%d", soma);
                }

                penultimoNum = ultimoNum;
                ultimoNum = soma;
            }
        }
    }
}
