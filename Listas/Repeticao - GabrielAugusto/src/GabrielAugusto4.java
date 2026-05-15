import java.util.*;

public class GabrielAugusto4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 1, triplo;

        while (num != -999){
            System.out.printf("Digite o número: ");
            num = sc.nextInt();

            if(num != -999){
                triplo = num * 3;
                System.out.printf("Triplo: %d\n\n", triplo);
            } else {
                break;
            }
        }
    }
}