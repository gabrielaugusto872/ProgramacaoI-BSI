import  java.util.*;

public class GabrielAugusto12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String anoAtual = "      ", nascimento = "      ", voto;


        while (anoAtual.charAt(2) != '/' || anoAtual.charAt(5) != '/'){
            System.out.printf("Formato necessário para entrada de datas:\n");
            System.out.printf("DD/MM/AAAA\n");

            System.out.printf("Digite o ano Atual: ");
            anoAtual = teclado.next();
            teclado.next();
            if(anoAtual)

            while (nascimento.charAt(2) != '/' || nascimento.charAt(5) != '/'){
                System.out.printf("Formato necessário para entrada de datas:\n");
                System.out.printf("DD/MM/AAAA\n");
                System.out.printf("Digite a data de nascimento: ");
                nascimento = teclado.next();
                teclado.next();
            }

        }
    }
}
