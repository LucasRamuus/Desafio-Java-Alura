import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) ;
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 e 100");
            numeroDigitado = numero.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você conseguiu acertar o número em " + tentativas + "tentativas!");
                break;
            } else if (numeroDigitado < numeroAleatorio ) {
                System.out.println("O número digitado é menor que o número aleatorio");

            } else {
                System.out.println("o número digitado é maior que o número aleatorio");
            }

        }

        if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
            System.out.println("Você não conseguiu acertar o número aleátorio em 5 tentativas, o número era: " + numeroAleatorio);
        }
    }

}