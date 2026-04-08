import java.util.*;

public class GabrielAugusto5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        char caractere;

        while(true){
            System.out.printf("Digite um caractere (; para sair): ");
            caractere = Character.toUpperCase(teclado.next().charAt(0));

            if (caractere == ';') break;

            if(caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U'){
                System.out.printf("O caracter %c é uma vogal.\n", caractere);
            } else {
                System.out.printf("O caracter %c não é uma vogal.\n", caractere);
            }
        }
    }
}
