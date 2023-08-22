package Atividade2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operacao (+,-,*,/): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Operacao invalida");
        }
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

}
