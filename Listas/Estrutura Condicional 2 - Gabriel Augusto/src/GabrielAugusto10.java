import java.util.*;

public class GabrielAugusto10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double peso, altura, imc;
        String condicao;

        System.out.printf("Digite o valor do peso: ");
        peso = teclado.nextDouble();
        System.out.printf("Digite o valor da altura: ");
        altura = teclado.nextDouble();

        imc = peso / Math.pow(altura, 2);

        if(imc <= 18.5){
            condicao = "Abaixo do peso";
        } else if(imc > 18.5 && imc <= 25){
            condicao = "Peso normal";
        } else if(imc > 25 && imc <= 30){
            condicao = "Acima do peso";
        } else {
            condicao = "Obeso";
        }

        System.out.printf("IMC: %.0f\nCondição: %s", imc, condicao);

    }
}
