import java.util.*;

public class GabrielAugusto8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double x, resultado;

        System.out.printf("Digite o valor de x: ");
        x = teclado.nextDouble();

        if (x <= 1){
            resultado = 1;
        } else if (x <= 2){
            resultado = 2;
        } else if (x <= 3){
            resultado = Math.pow(x, 2);
        } else {
            resultado = Math.pow(x, 3);
        }

        System.out.printf("f(x) = %.2f", resultado);
    }
}
