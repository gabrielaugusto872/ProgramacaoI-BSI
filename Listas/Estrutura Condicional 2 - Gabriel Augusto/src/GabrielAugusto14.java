import java.util.Scanner;

public class GabrielAugusto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, centena, dezena;

        System.out.printf("Digite o número: ");
        num = sc.nextInt();


        centena = num / 100;
        num = num - (centena * 100);

        dezena = num / 10;
        num = num - (dezena * 10);

        if(centena == num && dezena == num){
            System.out.printf("Palíndromo.");
        } else {
            System.out.printf("Não é palíndromo.");
        }
    }
}
