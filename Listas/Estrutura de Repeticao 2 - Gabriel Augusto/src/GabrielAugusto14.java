import java.util.*;

public class GabrielAugusto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, fatorial = 0;

        System.out.printf("Digite o valor de N: ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if (i == 1){
                fatorial = 1;
            } else {
                fatorial *= i;
            }
        }
        System.out.println(fatorial);
    }
}
