import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int celsius;
        System.out.println("Quantos Celsius você deseja converter para Fahrenheit: ");
        celsius = valor.nextInt();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura convertido de Celsius para Fahrenheit é: " + fahrenheit);

        int conversao = (int) fahrenheit;

        System.out.println("Resultado sem casa decimais: " + conversao);
    }
}