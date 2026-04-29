import java.util.Scanner;

public class GabrielAugusto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, milhar, centena, dezena, decimal;

        System.out.printf("Digite o número: ");
        num = sc.nextInt();

        milhar = num / 1000;
        num = num - (milhar * 1000);

        centena = num / 100;
        num = num - (centena * 100);

        dezena = num / 10;
        num = num - (dezena * 10);

        if(milhar == 0 || milhar == 1){
            if(centena == 0 || centena == 1){
                if(dezena == 0 || dezena == 1){
                    if(num == 0 || num == 1){
                        decimal = num + (dezena * 2) + (centena * 4) + (milhar * 8);
                        System.out.println(decimal);
                    }
                }
            }
        }
    }
}
