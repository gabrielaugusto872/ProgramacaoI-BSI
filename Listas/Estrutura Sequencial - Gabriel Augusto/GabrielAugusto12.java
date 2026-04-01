import java.util.Scanner;

public class GabrielAugusto12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double kmPorDia, ruaA, ruaC, ruaB, perimetro, voltas;

        System.out.printf("Digite a distância a ser percorrida por dia: ");
        kmPorDia = teclado.nextDouble();
        System.out.printf("Digite a medida da rua A: ");
        ruaA = teclado.nextDouble();
        System.out.printf("Digite a medida da rua B: ");
        ruaB = teclado.nextDouble();

        ruaC = Math.sqrt(Math.pow(ruaA, 2) + Math.pow(ruaB,2));
        perimetro = ruaA + ruaB + ruaC;
        voltas = kmPorDia / perimetro;

        System.out.printf("Voltas: %.0f", voltas);
    }
}
