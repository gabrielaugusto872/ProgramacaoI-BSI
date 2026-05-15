import java.util.*;

public class GabrielAugusto16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int algarismoInt, binario, tamanho, casaOctal = 1, casaHexadecimal = 1;
        double octal = 0, decimal = 0, hexadecimal = 0, contadorOctal = 0, contadorHexadecimal = 0;
        char algarismoChar;
        String stringBinario, stringHexadecimal = "";

        System.out.printf("Digite o valor do número binário: ");
        stringBinario = sc.nextLine();

        binario = Integer.valueOf(stringBinario);
        tamanho = stringBinario.length();

        for(int i=0;i<tamanho;i++){
            algarismoChar = stringBinario.charAt(i);
            algarismoInt = algarismoChar - '0';
            if (algarismoInt == 0 || algarismoInt == 1){
                if (contadorOctal < 3){
                    octal += casaOctal * (algarismoInt * (Math.pow(2, contadorOctal)));
                    contadorOctal++;
                } else {
                    casaOctal *= 10;
                    contadorOctal = 0;
                    octal += casaOctal * (algarismoInt * (Math.pow(2, contadorOctal)));
                    contadorOctal++;
                }
                if (contadorHexadecimal < 4){
                    hexadecimal += casaHexadecimal * (algarismoInt * (Math.pow(2, contadorHexadecimal)));
                    contadorHexadecimal++;
                } else {
                    if(hexadecimal > 9){
                        if(hexadecimal == 10){
                            stringHexadecimal = "A";
                        } else if(hexadecimal == 11){
                            stringHexadecimal = "B";
                        } else if(hexadecimal == 12){
                            stringHexadecimal = "C";
                        } else if(hexadecimal == 13){
                            stringHexadecimal = "D";
                        } else if(hexadecimal == 14){
                            stringHexadecimal = "E";
                        } else {
                            stringHexadecimal = "F";
                        }
                    } else {
                        String
                    }
                    contadorHexadecimal = 0;
                }
            } else {
                break;
            }
        }

        System.out.printf("%.0f\n%s\n", octal, stringHexadecimal);

    }
}
