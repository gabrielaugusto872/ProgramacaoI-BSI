import java.util.*;

public class GabrielAugusto3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double custoFabrica, custoConsumidor, porcentagem, impostos;

        System.out.printf("Digite o valor do custo de Fábrica: ");
        custoFabrica = teclado.nextDouble();

        if (custoFabrica <= 28000){
            porcentagem = custoFabrica * 0.05;
            impostos = 0;
        } else if(custoFabrica <= 45000){
            porcentagem = custoFabrica * 0.10;
            impostos = custoFabrica * 0.15;
        } else {
            porcentagem = custoFabrica * 0.15;
            impostos = custoFabrica * 0.20;
        }

        custoConsumidor = custoFabrica + porcentagem + impostos;
        System.out.printf("Custo para o consumidor: R$ %.2f", custoConsumidor);
    }
}
