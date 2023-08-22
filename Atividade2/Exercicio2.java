package Atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversao: ");
        System.out.println("1 - Celsius -> Fahrenheit");
        System.out.println("2 - Fahrenheit -> Celsius");

        int escolha = scanner.nextInt();

        double temperatura;
        double resultado;

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + resultado);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + resultado);
        } else {
            System.out.println("Escolha invalida ");
        }
        scanner.close();
    }
}
