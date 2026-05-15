import java.util.Scanner;

public class GabrielAugusto17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, maior, menor, meio;

        System.out.printf("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.printf("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.printf("Digite o terceiro número: ");
        num3 = sc.nextInt();

        maior = num1;
        menor = num1;

        if(num2 > menor){
            menor = num2;
        }
        if (num2 > maior){
            maior = num2;
        }

        if(num3 < menor){
            menor = num3;
        }
        if(num3 > maior){
            maior = num3;
        }

        meio = num1 + num2 + num3 - menor - maior;

        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);
        System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
