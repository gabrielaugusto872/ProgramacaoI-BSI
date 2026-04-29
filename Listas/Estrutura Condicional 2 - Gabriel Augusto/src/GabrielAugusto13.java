import java.util.*;

public class GabrielAugusto13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        System.out.printf("Digite o primeiro valor: ");
        num1 = sc.nextDouble();
        System.out.printf("Digite o segundo valor: ");
        num2 = sc.nextDouble();
        System.out.printf("Digite o terceiro valor: ");
        num3 = sc.nextDouble();

        if(num1 + num2 >= num3 && num1 + num3 >= num2 && num3 + num2 >= num1){
            if (num1 == num2 && num2 == num3){
                System.out.printf("Equilátero");
            } else if (num1 == num2 || num2 == num3 || num1 == num3){
                System.out.printf("Isóceles");
            } else {
                System.out.printf("Escaleno");
            }
        } else {
            System.out.printf("Não forma triangulo");
        }

    }
}
