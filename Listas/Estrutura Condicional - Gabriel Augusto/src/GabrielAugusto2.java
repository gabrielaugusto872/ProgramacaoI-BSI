import java.util.*;

public class GabrielAugusto2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double num = 1, resto;

        while (num != 0){
            System.out.printf("Digite um número: ");
            num = teclado.nextDouble();

            resto = num % 2;
            if(resto == 0){
                System.out.printf("O número %.1f é par.\n", num);
            } else if (resto == 1){
                System.out.printf("O número %.1f é impar.\n", num);
            }
        }
    }
}
