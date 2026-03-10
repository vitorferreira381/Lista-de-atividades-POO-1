//Atividade 6

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite seu salário:");

        float salariobase = sa.nextFloat();

        //Calculo
        float gratificacao = salariobase * 0.05f;
        float imposto = salariobase * 0.07f;
        float salariofinal = salariobase + gratificacao - imposto;

        //Resultado
        System.out.println("Gratificação de: %.2f " + gratificacao);
        System.out.println("Imposto de: %.2f " + imposto);
        System.out.println("Salário final de: %.2f " + salariofinal);
    }
}
