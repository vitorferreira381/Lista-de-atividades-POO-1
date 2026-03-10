//Atividade 2

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner ma = new Scanner(System.in);
        System.out.println("Digite 3 notas separadas por ENTER para calcular a média aritmética:");

        float n1 = ma.nextFloat(), n2 = ma.nextFloat(), n3 = ma.nextFloat();

        //Calculo
        float resultado = (n1 + n2 + n3) / 3;

        //Resultado
        System.out.println("Média aritmética igual a: %.2f " + resultado);
    }
}
