import java.util.Scanner;

public class GabrielAugusto20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double pagoHoraTrabalhada = 0.125, pagoHoraExtra = 0.25, horasTrabalhadas, salarioMinimo, salarioBruto, receberHoraExtra, horasExtras, salarioFinal;

        System.out.printf("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextDouble();
        System.out.printf("Digite o valor do salário mínimo: ");
        salarioMinimo = teclado.nextDouble();
        System.out.printf("Digite o número de horas extras feitas: ");
        horasExtras = teclado.nextDouble();

        pagoHoraTrabalhada = salarioMinimo * pagoHoraTrabalhada;
        pagoHoraExtra = salarioMinimo * pagoHoraExtra;
        salarioBruto = horasTrabalhadas * pagoHoraTrabalhada;
        receberHoraExtra = horasExtras * pagoHoraExtra;
        salarioFinal = salarioBruto + receberHoraExtra;

        System.out.printf("Salário a receber: %.2f", salarioFinal);

    }
}
