import java.util.Scanner;

public class GabrielAugusto14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double lado1, lado2, area, potencia;

        System.out.printf("Digite o tamanho do lado maior: ");
        lado1 = teclado.nextDouble();
        System.out.printf("Digite o tamanho do lado menor: ");
        lado2 = teclado.nextDouble();

        area = lado1 * lado2;
        potencia = area * 18;

        System.out.printf("Potência necessária: %.1f W", potencia);
    }
}
