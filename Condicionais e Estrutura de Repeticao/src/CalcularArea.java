//3.Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
import java.util.Scanner;

public class CalcularArea {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while(3 != escolha){
            System.out.println("---Escolha uma das Opções---");
            System.out.println("Opção 1. Calcular área do quadrado");
            System.out.println("Opção 2. Calcular área do círculo");
            System.out.println("Opção 3. Sair");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("Digite o Lado do quadrado");
                double quadrado = scanner.nextDouble();
                double areaQuadrado = quadrado * quadrado;

                System.out.println("Área do quadrado é " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o Raio do círculo");
                double circulo = scanner.nextDouble();
                double areaCirculo = 3.14 * circulo * circulo;

                System.out.println("Área do circulo é " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Opção invalida, Digite umas das 3 opções!");
            }



        }
    }
}
