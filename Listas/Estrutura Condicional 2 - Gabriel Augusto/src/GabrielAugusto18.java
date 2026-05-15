import java.util.*;

public class GabrielAugusto18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, quantia;
        double preco, total, desconto, precoFinal;

        System.out.printf("Digite o código do produto: ");
        cod = sc.nextInt();
        System.out.printf("Digite a quantia: ");
        quantia = sc.nextInt();

        if (cod > 0 && cod < 41) {
            if (cod > 0 && cod < 11) {
                preco = 10;
            } else if (cod < 21) {
                preco = 20;
            } else if (cod < 31) {
                preco = 30;
            } else {
                preco = 40;
            }

            total = preco * quantia;

            if(total <= 250){
                desconto = total * 0.05;
            } else if(total <= 500){
                desconto = total * 0.10;
            } else {
                desconto = total * 0.15;
            }

            precoFinal = total - desconto;

            System.out.printf("Preço do produto: R$ %.2f\n", preco);
            System.out.printf("Preço total da nota: R$ %.2f\n", total);
            System.out.printf("Desconto: R$ %.2f\n", desconto);
            System.out.printf("Preço Final: R$ %.2f\n", precoFinal);

        } else {
            System.out.printf("Produto não encontrado!");
        }
    }
}
