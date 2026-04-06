import java.util.Scanner;

public class GabrielAugusto24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, raiz1, raiz2, delta;

        System.out.printf("Digite os coeficientes da equação: \n");
        System.out.printf("a: ");
        a = teclado.nextDouble();
        System.out.printf("b: ");
        b = teclado.nextDouble();
        System.out.printf("c: ");
        c = teclado.nextDouble();

        delta = (Math.pow(b,2)) - (4 * a * c);

        if(delta > 0){
            raiz1 = ((b * -1) + (Math.sqrt(delta))) / (2 * a);
            raiz2 =  ((b * -1) - (Math.sqrt(delta))) / (2 * a);

            System.out.printf("Raíz 1: %.1f\n", raiz1);
            System.out.printf("Raíz 2: %.1f\n", raiz2);
        } else if(delta == 0){
            raiz1 = (b * -1) / (2 * a);

            System.out.printf("Raíz : %.1f\n", raiz1);
        } else if(delta < 0){
            System.out.printf("Essa equação não tem raíz real.\n");
        }
    }
}
