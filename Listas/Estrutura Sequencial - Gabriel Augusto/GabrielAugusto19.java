import java.util.Scanner;

public class GabrielAugusto19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double num, numQuadrado, numCubo, numRaizQuadrada, numRaizCubica;

        System.out.printf("Digite um número: ");
        num = teclado.nextDouble();

        numQuadrado = Math.pow(num, 2);
        numCubo = Math.pow(num, 3);
        numRaizQuadrada = Math.sqrt(num);
        numRaizCubica = Math.cbrt(num);

        System.out.printf("%.2f elevado ao quadrado: %.2f\n",num, numQuadrado);
        System.out.printf("%.2f elevado ao cubo: %.2f\n",num, numCubo);
        System.out.printf("Raiz quadrada de %.2f: %.2f\n", num, numRaizQuadrada);
        System.out.printf("Raiz cúbica de %.2f: %.2f\n", num, numRaizCubica);
    }
}
