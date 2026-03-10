//Atividade 1

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner soma = new Scanner(System.in);
        System.out.println("Digite 4 números inteiros para somar, separados por ENTER:");

        float n1 = soma.nextFloat(), n2 = soma.nextFloat(), n3 = soma.nextFloat(), n4 = soma.nextFloat();

        //Calculo
        float resultado = n1 + n2 + n3 + n4;

        //Resultado
        System.out.println("Soma igual a: %.2f" + resultado);
    }
}
