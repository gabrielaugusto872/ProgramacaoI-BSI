import java.util.*;

public class GabrielAugusto1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = 999;
        String categoria = "";

        while (idade > 0){
            System.out.printf("Digite a idade do nadador: ");
            idade = teclado.nextInt();

            if (idade < 5){
                categoria = "Idade não condiz com nenhuma categoria";
            } else if (idade >= 5 && idade <= 7){
                categoria = "Infantil";
            } else if (idade >= 8 && idade <= 10){
                categoria = "Juvenil";
            } else if (idade >= 11 && idade <= 15){
                categoria = "Adolescente";
            } else if (idade >= 16 && idade <= 40){
                categoria = "Adulto";
            } else if (idade > 40){
                categoria = "Sênior";
            }

            System.out.printf("Categoria do nadador: %s\n\n", categoria);
        }
    }
}