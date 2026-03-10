//Atividade 5

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        //Coleta de dados
        Scanner sp = new Scanner(System.in);
        System.out.println("Digite seu salário e a taxa de aumento separados por ENTER:");

        float salario = sp.nextFloat();
        float percentual = sp.nextFloat();

        //Calculo
        float aumento = salario * (percentual / 100);

        //Resultado + calculo final
        System.out.println("Aumento de: %.2f " + aumento);
        System.out.println("Salário final: %.2f " + (salario + aumento));
    }
}
