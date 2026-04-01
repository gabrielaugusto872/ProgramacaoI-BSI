import java.util.Scanner;


public class GabrielAugusto10 {
    public static void main(String[] args){
        final int anos = 2;
        final double deposito = 2000;

        double total;
        int meses;

        meses = anos * 12;
        total = deposito * Math.pow((1 + 0.05), meses);

        System.out.printf("Total acumulado após %d meses: R$ %.2f", meses, total);
    }
}
