import java.util.Scanner;

public class GabrielAugusto16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int minutos, horas, horasMin;

        System.out.printf("Digite o valor em minutos: ");
        minutos = teclado.nextInt();

        horas = minutos / 60;
        horasMin = minutos % 60;

        System.out.printf("%d minutos equivalem a %d horas e %d minutos.", minutos, horas, horasMin);
    }
}
