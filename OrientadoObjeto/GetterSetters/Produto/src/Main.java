// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo preço após Desconto: " + produto.getPreco());

    }
}