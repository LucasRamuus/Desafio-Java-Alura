// Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lulu", 7.8, 8.9, 9.2);
        Aluno aluno2 = new Aluno("Karina", 9.3, 9.9, 4.4);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("nota 1: " + aluno1.getNota1());
        System.out.println("nota 2: " + aluno1.getNota2());
        System.out.println("nota 3: "+ aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("nota 1: " + aluno2.getNota1());
        System.out.println("nota 2: " + aluno2.getNota2());
        System.out.println("nota 3: "+ aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println();


    }
}