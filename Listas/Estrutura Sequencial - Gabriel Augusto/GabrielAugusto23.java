import java.util.Scanner;

public class GabrielAugusto23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final int totalEspectadores = 3000;
        int A, B, C, AB, AC, BC, ABC, assiste, nenhuma;

        System.out.printf("Digite a quantidade de espectadores de cada novela:\n");
        System.out.printf("A: ");
        A = teclado.nextInt();
        System.out.printf("B: ");
        B = teclado.nextInt();
        System.out.printf("C: ");
        C = teclado.nextInt();
        System.out.printf("AB: ");
        AB = teclado.nextInt();
        System.out.printf("AC: ");
        AC = teclado.nextInt();
        System.out.printf("BC: ");
        BC = teclado.nextInt();
        System.out.printf("ABC: ");
        ABC = teclado.nextInt();

        assiste = (A + B + C) - AB - AC - BC + (ABC);
        nenhuma = totalEspectadores - assiste;

        System.out.printf("Número de telespectadore(s) que não assiste(m) nenhuma novela: %d", nenhuma);
    }
}
