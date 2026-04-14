import java.util.*;

public class GabrielAugusto11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        final double PI = 3.14;
        double tensao, diametro, carga, n;

        System.out.printf("Digite o diâmetro da barra: ");
        diametro = teclado.nextDouble();
        System.out.printf("Digite o valor da carga: ");
        carga = teclado.nextDouble();

        if(diametro > 100){
            n = 2;
        } else if(diametro < 50){
            n = 6;
        } else {
            n = 4;
        }

        tensao = ((4 * carga) / (PI * Math.pow(diametro, 2)) * n);

        System.out.printf("Tensão S: %.2f", tensao);
    }
}