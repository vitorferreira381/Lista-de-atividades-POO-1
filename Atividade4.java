//Atividade 4

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite seu salário:");

        float salario = sa.nextFloat();

        //Calculo
        float salariofinal = salario * 1.25f;

        //Resultado
        System.out.println("Salário aumentado em 25%, valor atual: %.2f" + salariofinal);
    }
}
