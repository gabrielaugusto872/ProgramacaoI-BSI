import java.util.*;

public class Aula01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean chuva = false;
        double dinheiro;

        System.out.printf("Digite quanto você tem de grana: ");
        dinheiro = teclado.nextDouble();

        if (chuva && dinheiro >= 50){
            System.out.printf("Ida ao cinema confirmada!");
        } else {
            System.out.printf("Ida ao cinema cancelada!");
        }
    }
}
