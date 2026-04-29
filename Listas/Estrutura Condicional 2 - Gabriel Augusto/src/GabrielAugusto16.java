import java.util.*;

public class GabrielAugusto16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;
        boolean bissexto;

        System.out.printf("Digite o ano: ");
        ano = sc.nextInt();

        if (ano % 4 == 0){
            if (ano % 100 != 0 || ano % 400 == 0){
                System.out.printf("Ano bissexto");
            } else {
                System.out.printf("Não é um ano bissexto");
            }
        } else {
            System.out.printf("Não é um ano bissexto");
        }
    }
}
