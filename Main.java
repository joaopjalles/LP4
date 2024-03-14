import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio4();
    }
    public static void exercicio4() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDigite o salário: ");
        double salario = scn.nextDouble();
        System.out.println("\nDigite o percentual de aumento: ");
        double percentualAumento = scn.nextDouble();
        double aumento = salario * (percentualAumento / 100);
        double novoSalario = salario + aumento;
        System.out.println("Você obteve um aumento de: " + aumento);
        System.out.println("Seu novo salário é: " + novoSalario);
    }
}