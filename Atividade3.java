//Atividade 3

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner mp = new Scanner(System.in);
        System.out.println("Digite 3 notas e seu peso separadas por ENTER para calcular a média ponderada:");

        float n1 = mp.nextFloat(), p1 = mp.nextFloat();
        float n2 = mp.nextFloat(), p2 = mp.nextFloat();
        float n3 = mp.nextFloat(), p3 = mp.nextFloat();

        //Calculo
        float resultado = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);

        //Resultado
        System.out.println("Média aritmética igual a: %.2f " + resultado);
    }
}
