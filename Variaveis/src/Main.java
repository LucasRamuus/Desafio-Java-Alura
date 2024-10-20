// 1.Crie um programa que realize a média de duas notas decimais e exiba o resultado.
// 2.Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado
// 3.Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
// 4.Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
// 5.Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
// 6.Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
public class Main {
    public static void main(String[] args) {
        /*double nota1 = 8.5;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;
        System.out.println("A média da nota é: " + media);

        double decimal = 13.6;
        int inteiro = (int) decimal;
        System.out.println("Casting double para Int: " + inteiro);

        char letra = 'L';
        String palavra = "Cachorro";
        System.out.println("A letra é: " + letra + "\nA palavra é: " + palavra);

        double precoProduto = 18.50;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total do produto será: R$" + valorTotal );

        double valorEmDolares = 20.99;
        double valorEmReal = 4.94;
        double conversao = valorEmDolares * valorEmReal;
        System.out.println("O valor em dólar de: US$" + valorEmDolares + " Para Real é : R$" + conversao);*/

        double precoOriginal = 130.0;
        double porcentualDesconto = 20;
        double valorDesconto = (porcentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - valorDesconto;

        System.out.println("Preço do Produto é: R$" + precoOriginal);
        System.out.println("Valor do Desconto é R$" + valorDesconto);
        System.out.println("Valor Do produto com Desconto é R$" + valorFinal);



    }
}