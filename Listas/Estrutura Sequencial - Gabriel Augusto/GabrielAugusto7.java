import java.util.Scanner;

public class GabrielAugusto7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, area, perimetro;

        System.out.printf("Digite o valor dos lados maiores: ");
        lado1 = teclado.nextDouble();

        System.out.printf("Digite o valor dos lados menores: ");
        lado2 = teclado.nextDouble();

        area = lado1 * lado2;
        perimetro = (lado1 + lado2) * 2;

        System.out.printf("Área: %.2f\nPerímetro: %.2f", area, perimetro);

    }
}
