import java.util.*;

public class GabrielAugusto4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double num1, num2, resultado = 0;
        char opcao;
        String operacao = "";

        do {
            System.out.println("MENU");
            System.out.println("+ - Soma");
            System.out.println("- - Subtração");
            System.out.println("* - Multiplicação");
            System.out.println("/ - Divisão");
            System.out.println("0 - Sair");
            System.out.printf("Digite o caractere de acordo com a operação que desejar: ");

            opcao = teclado.next().charAt(0);

            if (opcao == '0'){
                break;
            }

            System.out.printf("Digite o primeiro número: ");
            num1 = teclado.nextDouble();
            System.out.printf("Digite o segundo número: ");
            num2 = teclado.nextDouble();

            switch (opcao){
                case '+':
                    resultado = num1 + num2;
                    operacao = num1 + " + " + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    operacao = num1 + " - " + num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    operacao = num1 + " * " + num2;
                    break;
                case '/':
                    if (num2 == 0){
                        System.out.println("\n" + "Não é possível fazer divisão por zero." + "\n");
                        continue;
                    } else {
                        resultado = num1 / num2;
                        operacao = num1 + " / " + num2;
                    }
                    break;
                default:
                    System.out.println("\n" + "Operação inválida" + "\n");
                    continue;
            }

            System.out.println("\n" + operacao + " = " + resultado + "\n");

        } while (true);

        teclado.close();

    }
}
